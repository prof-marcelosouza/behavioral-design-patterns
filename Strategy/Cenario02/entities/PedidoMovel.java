package entities;

public class PedidoMovel extends Pedido {

    private String nomeSetor;

    public PedidoMovel(double valor) {
        super(valor);
    }

    public String getNomeSetor() {
        return nomeSetor;
    }

    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }
}
