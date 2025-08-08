package lista1;

import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a temperatura em graus Farenheit: ");
        double tempF = input.nextFloat();

        double tempC = (tempF - 32) / 1.8;

        System.out.printf("A temperatura convertidade de Farenheit para Celcius é de: R$ %.2f", tempC);
    }
}
