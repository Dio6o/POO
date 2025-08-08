package lista1;

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o comprimento do lado do quadrado: ");
        float lado = input.nextFloat();

        float area = lado * lado;

        System.out.printf("A área do quadrado é de: %.1f", area);
    }
}
