package lista2;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] ags){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = input.nextInt();

        int maior = 0;
        int menor = 0;

        if (num1 > num2 && num1 > num3){
            maior = num1;
            menor = Math.min(num2, num3);

        } else if (num2 > num1 && num2 > num3){
            maior = num2;
            menor = Math.min(num1, num3);

        } else {
            maior = num3;
            menor = Math.min(num2, num1);
        }

        System.out.printf("Maior número: %d, menor número: %d\n", maior, menor);

    }
}
