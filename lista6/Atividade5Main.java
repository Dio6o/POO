package lista6;
import java.util.Scanner;

public class Atividade5Main {
    public static void main(String[] args) {
        Atividade5 cardapio = new Atividade5();
        Scanner input = new Scanner(System.in);

        int codigo;
        int quantidade;
        double total = 0;

        do{
            System.out.print("Informe o código do item: ");
            codigo = input.nextInt();
            System.out.print("Informe a quantidade do item: ");
            quantidade = input.nextInt();

            cardapio.setCodigo(codigo);
            cardapio.setQuantidade(quantidade);
            total += cardapio.total();

        } while (codigo != 0);

        System.out.println("Total do pedido: R$ " + total);

        //System.out.println(cardapio.total2(101, 1));

    }
}
