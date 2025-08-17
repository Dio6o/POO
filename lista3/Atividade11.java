package lista3;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);

        int pares = 0;
        int impares = 0;

        for (int x = 1; x <= 10; x++){
            System.out.print("Digite um valor: ");
            int valor = input.nextInt();

            if (valor % 2 == 0){
                pares++;
            } else {
                impares++;
            }
        }

        System.out.printf("Pares: %d,  Impares: %d\n", pares, impares);
    }
}
