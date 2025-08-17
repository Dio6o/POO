package lista3;

import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Qual a quantidade de notas? ");
        int n = input.nextInt();
        double soma = 0;

        for(int i = 1; i <= n; i++){
            System.out.printf("Informe a nota %d: ", i);
            int nota = input.nextInt();
            soma += nota;
        }

        System.out.printf("A média aritmética de %d notas foi de: %.2f\n", n, soma/n);
    }
}
