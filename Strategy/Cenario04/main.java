import entities.*;

public class main {

    public static void main(String[] args) throws Exception {

        FreteComum freteComum = new FreteComum();
        FreteExpresso freteExpresso = new FreteExpresso();

        Pedido pe = new PedidoEletronico();
        pe.setValor(1000.0);
        pe.setTipoFrete(freteComum);

        System.out.println("Frete comum - ELETRO:");
        System.out.println(pe.calculaFrete());

        pe.setTipoFrete(freteExpresso);

        System.out.println("Frete expresso - ELETRO:");
        System.out.println(pe.calculaFrete());

        Pedido pm = new PedidoMovel();
        pe.setValor(1000.0);
        pe.setTipoFrete(freteComum);

        System.out.println("Frete comum - MÓVEL:");
        System.out.println(pe.calculaFrete());

        /*
        pe.setTipoFrete(freteExpresso);

        System.out.println("Frete expresso - MÓVEL:");
        System.out.println(pe.calculaFrete());
        */
    }
}