package entities;

public class PedidoEletronico extends Pedido {

    private String nomeSetor;

    public PedidoEletronico(double valor) {
        super(valor);
    }

    public String getNomeSetor() {
        return nomeSetor;
    }

    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }
}
