package lista2;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("""
                Em qual turno você estuda?,
                M - Matutino,
                V - Vespertino,
                N - Noturno.
                ->""");
        String turno = input.nextLine();

        switch (turno) {
            case "M" -> System.out.println("Bom dia!");
            case "V" -> System.out.println("Boa tarde!");
            case "N" -> System.out.println("Boa noite!");
            default -> System.out.println("Erro!");
        }

    }
}
