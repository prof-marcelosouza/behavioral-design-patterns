package entities;

import entities.states.*;

public class Pedido {

    private State aguardandoPagamento;
    private State pago;
    private State cancelado;
    private State enviado;
    private State estadoAtual;

    public Pedido() {
        this.aguardandoPagamento = new AguardandoPagamentoState(this);
        this.pago = new PagoState(this);
        this.cancelado = new CanceladoState(this);
        this.enviado = new EnviadoState(this);
        this.estadoAtual = aguardandoPagamento;
    }

    public void realizarPagamento() throws Exception {
        this.estadoAtual.sucessoAoPagar();
    }

    public void cancelarPedido() throws Exception {
        this.estadoAtual.cancelarPedido();
    }

    public void despacharPedido() throws Exception {
        try {
            this.estadoAtual.despacharPedido();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setEstadoAtual(State estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public State getAguardandoPagamento() {
        return aguardandoPagamento;
    }

    public State getPago() {
        return pago;
    }

    public State getCancelado() {
        return cancelado;
    }

    public State getEnviado() {
        return enviado;
    }
}
