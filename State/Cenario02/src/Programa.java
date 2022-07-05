import entities.Pedido;

public class Programa {

    public static void main(String[] args) throws Exception {

        System.out.println("Pedido #01: aguardandoPagamento...");
        Pedido p1 = new Pedido();
        p1.despacharPedido();

        System.out.println("Pedido #02: aguardandoPagamento...");
        Pedido p2 = new Pedido();
        p2.realizarPagamento();
        p2.despacharPedido();

        System.out.println("Pedido #03: aguardandoPagamento...");
        Pedido p3 = new Pedido();
        p3.cancelarPedido();
    }

}
