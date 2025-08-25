package lista4;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] vet = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.print("Digite o valor para a posição: " + (i + 1) + " ");
            vet[i] = input.nextInt();
        }

        for(int i = 0; i < 5; i++){
            System.out.print(vet[i] + " ");
        }

    }

}