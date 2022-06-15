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

    @Override
    public double calculaFreteComum() {
        return getValor() * 0.05;
    }

    @Override
    public double calculaFreteExpresso() throws Exception {
        throw new Exception("MODALIDADE DE FRETE INDISPONÍVEL.");
    }
}
