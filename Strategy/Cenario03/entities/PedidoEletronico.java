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

    @Override
    public double calculaFreteComum() {
        return getValor() * 0.05;
    }

    @Override
    public double calculaFreteExpresso() {
        return getValor() * 0.1;
    }
}
