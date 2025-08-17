package lista3;

import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o tamanho do conjunto? ");
        int tamanho = input.nextInt();

        int menor = 100000;
        int maior = -100000;
        int soma = 0;

        for (int i = 0; i<tamanho; i++){
            System.out.print("Digite um valor: ");
            int valor = input.nextInt();

            if (valor < menor){
                menor = valor;
            }

            if (valor > maior){
                maior = valor;
            }
            soma += valor;
        }

        System.out.printf("O maior valor do conjunto: %d, o menor valor: %d, a soma: %d.", maior, menor, soma);
    }
}
