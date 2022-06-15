import entities.Pedido;

public class main {

    public static void main(String[] args) {

        Pedido p = new Pedido(100);
        System.out.println("Frete comum: R$" + p.calculaFreteComum());
        System.out.println("Frete expresso: R$" + p.calculaFreteExpresso());

    }
}
