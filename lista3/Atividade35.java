package lista3;

import java.util.Scanner;

public class Atividade35 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha o itens do pedido: \n Digite '0' para finalizar.");

        double total = 0;
        int codigo = 0;
        int quantidae = 0;

        do {
            System.out.print("Digite o código do item: ");
            codigo = input.nextInt();

            System.out.print("Digite a quantidade do item: ");
            quantidae = input.nextInt();

            if(codigo == 0){
                System.out.println("Programa finalizado.");
                break;
            }

            if (codigo == 100){
                System.out.println("Cachorro quente selecionado, valor R$ " + (1.2 * quantidae));
                total += 1.2 * quantidae;
            } else if (codigo == 101){
                System.out.println("Bauru simples selecionado, valor R$ " + (1.3 * quantidae));
                total += 1.3 * quantidae;
            } else if (codigo == 102){
                System.out.println("Bauru com ovo selecionado, valor R$ " + (1.5 * quantidae));
                total += 1.5 * quantidae;
            } else if (codigo == 103){
                System.out.println("Hambúrguer selecionado, valor R$ " + (1.2 * quantidae));
                total += 1.2 * quantidae;
            } else if (codigo == 104){
                System.out.println("Cheeseburger selecionado, valor R$ " + (1.3 * quantidae));
                total += 1.3 * quantidae;
            } else if (codigo == 105){
                System.out.println("Hambúrguer selecionado, valor R$ " + (quantidae));
                total += quantidae;
            }


        } while (true);

        System.out.println("Total do pedido: R$ " + total);


    }
}
