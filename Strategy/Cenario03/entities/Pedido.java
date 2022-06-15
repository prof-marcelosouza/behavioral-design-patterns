package entities;

public abstract class Pedido {

    private double valor;

    public Pedido() {
    }

    public Pedido(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract double calculaFreteComum();

    public abstract double calculaFreteExpresso() throws Exception;
}
