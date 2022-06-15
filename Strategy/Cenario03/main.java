import entities.Pedido;
import entities.PedidoEletronico;
import entities.PedidoMovel;

public class main {

    public static void main(String[] args) throws Exception {

        Pedido pe = new PedidoEletronico(100);
        System.out.println("Pedido - ELETRO:");
        System.out.println("Frete comum: R$" + pe.calculaFreteComum());
        System.out.println("Frete expresso: R$" + pe.calculaFreteExpresso());

        Pedido pm = new PedidoMovel(100);
        System.out.println("Pedido - MÓVEL:");
        System.out.println("Frete comum: R$" + pm.calculaFreteComum());
        System.out.println("Frete expresso: R$" + pm.calculaFreteExpresso());
    }
}
