package entities.states;

import entities.Pedido;

public class AguardandoPagamentoState implements State {

    private Pedido pedido;

    public AguardandoPagamentoState(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void sucessoAoPagar() {
        this.pedido.setEstadoAtual(pedido.getPago());
    }

    @Override
    public void despacharPedido() throws Exception {
        throw new Exception("Operação não suportada, o pedido ainda não foi pago.");
    }

    @Override
    public void cancelarPedido() {
        this.pedido.setEstadoAtual(pedido.getCancelado());
    }
}
