package lista3;

import java.util.Scanner;

public class Atividade29 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Montar a tabuada de: ");
        int valor = input.nextInt();

        int inicio;
        int fim;
        do {
            System.out.print("Iniciar de: ");
            inicio = input.nextInt();

            System.out.print("Até: ");
            fim = input.nextInt();

            if(inicio > fim){
                System.out.println("Ínicio maior que o final, tente novamente.");
            }

        } while (inicio > fim);

        System.out.printf("Vou montar a tabuada de %d, começando em %d até %d.\n",valor, inicio, fim);
        for (int i = inicio; i <= fim; i++){
            System.out.printf("%d x %d = %d\n", valor, i, (valor * i));
        }
    }
}
