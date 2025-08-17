package lista3;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int fibi = 0;
        int current = 1;
        int last = 0;

        System.out.print("Digite até qual posição da sequência você deseja: ");
        int position = input.nextInt() + 1;

        for (int i = 1; i <= position; i++){
            System.out.println(fibi);
            fibi = current + last;

            current = last;
            last = fibi;
        }

    }
}
