package lista2;

import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float nota1 = input.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float nota2 = input.nextFloat();

        float media = (nota1 + nota2) / 2;

        if (media >= 7){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

    }
}
