package lista1;

import java.util.Scanner;
import java.lang.Math;

public class Atividade6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o raio do círculo: ");
        double raio = input.nextFloat();

        double area = Math.PI * raio * raio;

        System.out.printf("A área do círculo é de: %.1f", area);
    }
}
