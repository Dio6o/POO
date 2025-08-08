package lista1;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o primeiro número inteiro: ");
        int num1 = input.nextInt();

        System.out.print("Informe o segundo número inteiro: ");
        int num2 = input.nextInt();

        System.out.print("Informe o número real: ");
        double num3 = input.nextDouble();

        double a = (num1 * 2) * ((double) num2 / 2);
        System.out.printf("O produto do dobro do primeiro com metade do segundo: %.2f\n", a);

        double b = (num1 * 3) + num3;
        System.out.printf("A soma do triplo do primeiro com o terceiro: %.2f\n", b);

        double c = num3 * num3 * num3;
        System.out.printf("O terceiro elevado ao cubo: %.2f\n", c);

    }
}
