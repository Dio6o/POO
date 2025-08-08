package lista1;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe sua altura em metros: ");
        double h = input.nextDouble();

        double pesoIdeal = (72.7 * h) - 58;

        System.out.printf("Peso ideal: %.2f\n", pesoIdeal);

    }
}
