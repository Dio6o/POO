package lista2;

import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double nota1 = input.nextInt();

        System.out.print("Informe a segunda nota: ");
        double nota2 = input.nextInt();

        System.out.print("Informe a terceira nota: ");
        double nota3 = input.nextInt();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media < 7){
            System.out.printf("Reprovado, sua média foi de: %.2f.", media);
        } else if (media > 7){
            if (media == 10){
                System.out.print("Aprovado com Distinção, média 10.");
            } else {
                System.out.printf("Aprovado, sua média foi de: %.2f.", media);
            }
        }
    }
}
