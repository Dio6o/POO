package lista2;

import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = input.nextDouble();

        if (a == 0){
            System.out.println("Não é equação do segundo grau.");
            System.exit(0);
        }

        System.out.print("Digite o valor de B: ");
        double b = input.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = input.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
        double x1;
        double x2;

        if (delta < 0){
            System.out.println("Equação não possui raizes reais.");
            System.exit(0);
        } else if (delta == 0){
            x1 = -b / (2 * a);
            System.out.println("Delta igual a zero, logo x possui somente um valor: " + x1);
            System.exit(0);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("X1: " + x1 + " X2: " + x2);
        }

    }
}
