package lista1;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o peso total dos peixes: ");
        float pesoPeixes = input.nextFloat();

        float excesso = pesoPeixes - 50;

        float multa = excesso * 4;

        System.out.printf("Foram pescados %.2f kilos de peixe em execesso.\n" +
                "O valor da multa foi de: R$ %.2f", excesso, multa);

    }
}
