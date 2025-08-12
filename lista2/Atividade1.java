package lista2;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = input.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = input.nextInt();

        if ( num1 > num2)
            System.out.printf("%d maior que %d",  num1, num2);
        else
            System.out.printf("%d maior que %d",  num2, num1);
    }
}
