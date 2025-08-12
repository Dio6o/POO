package lista2;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String letra = input.nextLine();

        if (letra.equals("M")) {
            System.out.print("M - masculino.");
        } else if (letra.equals("F")) {
            System.out.print("F - feminino.");
        }
    }
}
