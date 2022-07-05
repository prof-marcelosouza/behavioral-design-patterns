package entities.states;

import entities.Pedido;

public class CanceladoState implements State {

    private Pedido pedido;

    public CanceladoState(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void sucessoAoPagar() throws Exception {
        throw new Exception("Operação não suportada, o pedido se encontra cancelado.");
    }

    @Override
    public void despacharPedido() throws Exception {
        throw new Exception("Operação não suportada, o pedido se encontra cancelado.");
    }

    @Override
    public void cancelarPedido() throws Exception {
        throw new Exception("Operação não suportada, o pedido se encontra cancelado.");
    }
}
