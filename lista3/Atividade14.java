package lista3;

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o série? ");
        int m = input.nextInt();
        int dif = 1;

        for (int i = 1; i < m; i++){
            System.out.printf("%d/%d \n", i, dif);
            dif += 2;
        }

    }
}
