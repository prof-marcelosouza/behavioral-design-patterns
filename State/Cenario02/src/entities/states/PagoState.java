package entities.states;

import entities.Pedido;

public class PagoState implements State {

    private Pedido pedido;

    public PagoState(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void sucessoAoPagar() throws Exception {
        throw new Exception("Operação não suportada, o pedido já foi pago.");
    }

    @Override
    public void despacharPedido() throws Exception {
        this.pedido.setEstadoAtual(pedido.getEnviado());
    }

    @Override
    public void cancelarPedido() {
        this.pedido.setEstadoAtual(pedido.getCancelado());
    }
}
