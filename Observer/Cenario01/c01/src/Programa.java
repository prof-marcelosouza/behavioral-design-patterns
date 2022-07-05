import entities.Newsletter;
import entities.observers.Cliente;
import entities.observers.Fornecedor;
import entities.observers.Funcionario;
import entities.observers.Parceiro;

public class Programa {

    public static void main(String[] args) {

        Newsletter news1 = new Newsletter();

        Funcionario func1 = new Funcionario("Jonas", "jon@gmail.com", news1);
        Cliente cli1 = new Cliente("Amanda", "amanda@gmail.com", news1);
        Parceiro par1 = new Parceiro("Patricia", "paty@gmail.com", news1);
        Fornecedor for1 = new Fornecedor("Bianca", "bianca@gmail.com", news1);

        news1.addMessage("Primeira mensagem!");
        System.out.println("-----------------------------------------------");

        news1.removeObserver(func1); news1.removeObserver(for1);

        news1.addMessage("Segunda mensagem!");
        System.out.println("-----------------------------------------------");

        news1.removeObserver(cli1);
        news1.removeObserver(par1);
        news1.registerObserver(func1);
        news1.addMessage("Terceira mensagem!");
        System.out.println("-----------------------------------------------");

    }

}
