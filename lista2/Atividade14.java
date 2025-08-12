package lista2;

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número de 1 até 7: ");
        int num1 = input.nextInt();

        switch (num1) {
            case 1:
                System.out.printf("%d - Domingo!", num1);
                break;
            case 2:
                System.out.printf("%d - Segunda-feira!", num1);
                break;
            case 3:
                System.out.printf("%d - Terça-feira!", num1);
                break;
            case 4:
                System.out.printf("%d - Quarta-feira!", num1);
                break;
            case 5:
                System.out.printf("%d - Quinta-feira!", num1);
                break;
            case 6:
                System.out.printf("%d - Sexta-feira!", num1);
                break;
            case 7:
                System.out.printf("%d - Sábado!", num1);
                break;
            default:
                System.out.println("Erro!");
                break;
        }
    }
}
