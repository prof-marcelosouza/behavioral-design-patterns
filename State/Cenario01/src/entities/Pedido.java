package entities;

public class Pedido {

    public final int AGUARDANDO_PAGAMENTO = 1;
    public final int PAGO = 2;
    public final int CANCELADO = 3;
    public final int ENVIADO= 4;
    private int estadoAtual;

    public Pedido() {
        this.estadoAtual = AGUARDANDO_PAGAMENTO;
    }

    public void sucessoAoPagar() {
        if (estadoAtual == AGUARDANDO_PAGAMENTO) {
            this.estadoAtual = PAGO;
        } else {
            System.out.println("O pedido não está aguardando pagamento.");
        }
    }

    public void cancelarPedido() {
        if (estadoAtual == AGUARDANDO_PAGAMENTO) {
            this.estadoAtual = CANCELADO;
        } else if (estadoAtual == PAGO) {
            this.estadoAtual = CANCELADO;
        } else {
            System.out.println("O pedido não pode ser cancelado.");
        }
    }

    public void despacharPedido() {
        if (estadoAtual == PAGO) {
            this.estadoAtual = ENVIADO;
        } else {
            System.out.println("O pedido não pode ser enviado.");
        }
    }
}
