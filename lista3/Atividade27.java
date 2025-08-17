package lista3;

import java.util.Scanner;

public class Atividade27 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Lojas tabajara");
        int marcador = 1;
        double total = 0;
        double item = 0;

        do {
            System.out.printf("Produto %d: R$ ", marcador);
            item = input.nextDouble();
            total += item;
            marcador++;
        }while(item != 0);

        System.out.println("Total: R$" + total);
        double pagamento;
        do {
            System.out.print("Dinheiro: R$ ");
            pagamento = input.nextDouble();
            if(pagamento < total){
                System.out.println("Pagamento insuficiente, tente novamente.");
            }
        } while(pagamento < total);

        System.out.println("Troco: R$" + (pagamento - total));

    }
}
