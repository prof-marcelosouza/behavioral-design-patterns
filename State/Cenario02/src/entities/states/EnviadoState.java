package entities.states;

import entities.Pedido;

public class EnviadoState implements State {

    private Pedido pedido;

    public EnviadoState(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void sucessoAoPagar() throws Exception {
        throw new Exception("Operação não suportada, o pedido ja foi pago e enviado.");
    }

    @Override
    public void despacharPedido() throws Exception {
        throw new Exception("Operação não suportada, o pedido ja foi enviado.");
    }

    @Override
    public void cancelarPedido() throws Exception {
        throw new Exception("Operação não suportada, o pedido ja foi enviado.");
    }
}
