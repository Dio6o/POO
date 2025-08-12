package lista2;

import java.util.Scanner;

public class Atividade27 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número: ");
        double num = input.nextDouble();

        double decimal = num - Math.round(num);

        if (decimal == 0){
            System.out.println("Número inteiro.");
        } else {
            System.out.println("Número decimal.");
        }

    }
}
