package lista3;

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int valor1;
        int valor2;

        do {
            System.out.print("Digite um valor: ");
            valor1 = input.nextInt();

            System.out.print("Digite outro valor: ");
            valor2 = input.nextInt();

            if (valor1 > valor2){
                System.out.println("O primeiro valor deve ser menor que o segundo.");
            }

        } while (valor1 > valor2);

        for (int x = valor1 + 1; x < valor2; x++){
            System.out.println(x);
        }
    }
}
