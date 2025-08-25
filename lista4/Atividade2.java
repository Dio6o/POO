package lista4;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];


        for(int i = 0; i < 10; i++){
            System.out.print("Digite o valor para a posição: " + (i + 1) + " ");
            nums[i] = input.nextInt();
        }

        for(int i = 9; i >= 0; i --){
            System.out.print(nums[i] + " ");
        }


    }
}
