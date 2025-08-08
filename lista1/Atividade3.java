package lista1;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String arg[]){
        Scanner input = new Scanner( System.in);

        int num1;
        int num2;
        int soma;

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextInt();

        soma = num1 + num2;

        System.out.printf("A soma dos dois números é %d", soma);

    }
}
