package lista3;

import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Até qual número você deseja calcular: ");
        int n = input.nextInt();
        int counter = 0;

        for (int i = 2; i <= n; i++){
            if ((i % 2 !=0 && i % 3 != 0) || (i == 2 || i == 3)){
                System.out.println(i + " é um número primo.");
            }
            counter +=2;
        }

        System.out.println("Total de divisões: " +  counter);
    }
}
