package lista2;

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primerio número: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = input.nextInt();

        int ordem1 = 0;
        int ordem2 = 0;
        int ordem3 = 0;

        if (num1 > num2 && num1 > num3){
            ordem1 = num1;
            if (num2 > num3){
                ordem2 = num2;
                ordem3 = num3;
            } else {
                ordem2 = num3;
                ordem3 = num2;
            }
        }
        else if (num2 > num1 && num2 > num3){
            ordem1 = num2;
            if (num1 > num3){
                ordem2 = num1;
                ordem3 = num3;
            } else {
                ordem2 = num3;
                ordem3 = num1;
            }
        }
        else if (num3 > num1 && num3 > num2){
            ordem1 = num3;
            if (num1 > num2){
                ordem2 = num1;
                ordem3 = num2;
            } else {
                ordem2 = num2;
                ordem3 = num1;
            }
        }
        System.out.printf("%d, %d, %d\n", ordem3, ordem2, ordem1);
    }
}
