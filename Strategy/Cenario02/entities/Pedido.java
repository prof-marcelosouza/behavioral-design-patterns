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

    public double calculaFreteComum() {
        return this.valor * 0.05;
    }

    public double calculaFreteExpresso() {
        return this.valor * 0.1;
    }
}
