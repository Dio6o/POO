package lista2;

import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float nota1 = input.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float nota2 = input.nextFloat();

        float media = (nota1 + nota2) / 2;

        if (media < 3){
            System.out.println("Reprovado");
        } else if (media >= 3 && media < 7){
            System.out.println("Em Exame");
        } else if (media > 7){
            System.out.println("Aprovado");
        }

    }
}
