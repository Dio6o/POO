package lista1;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe sua altura em metros: ");
        double h = input.nextDouble();

        double pesoIdealHomen = (72.7 * h) - 58;
        double pesoIdealMulher = (62.1 * h) - 44.7;

        System.out.printf("Peso ideal homen: %.2f\n" +
                "Peso ideal mulher: %.2f", pesoIdealHomen,  pesoIdealMulher);
    }
}
