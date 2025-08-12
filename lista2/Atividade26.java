package lista2;

import java.util.Scanner;

public class Atividade26 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("Número par.");
        } else {
            System.out.println("Número ímpar.");
        }
    }
}
