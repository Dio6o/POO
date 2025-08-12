package lista2;

import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o valor do saque: ");
        int saque = input.nextInt();

        if (saque < 10 || saque > 600){
            System.out.println("O valor do saque deve ser de R$ 10.00 até R$ 600.00.");
        } else {
            int nota100 = saque / 100;
            saque = saque - nota100 * 100;

            int nota50 = saque / 50;
            saque = saque - nota50 * 50;

            int nota10 = saque / 10;
            saque = saque - nota10 * 10;

            int nota5 = saque / 5;
            saque = saque - nota5 * 5;

            int nota1 = saque;

            System.out.printf("Notas de R$ 100.00: %d, notas de R$ 50.00: %d, notas de R$ 10.00: %d," +
                    "notas de R$ 5.00 %d, notas de R$ 1.00: %d", nota100, nota50, nota10, nota5, nota1);
        }
    }
}
