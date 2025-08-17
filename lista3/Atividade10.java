package lista3;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da base: ");
        int base = input.nextInt();

        System.out.print("Digite o valor do expoente: ");
        int expoente = input.nextInt();

        int total = base;

        for(int x = 1; x < expoente; x++){
            total = total * base;
        }

        System.out.println("Total: " + total);
    }
}
