package lista4;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] nums = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];

        for(int i = 0; i < nums.length; i++){
            System.out.print("Digite um numero: ");
            nums[i] = input.nextInt();
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                pares[i] = nums[i];
            } else if(nums[i] % 2 != 0){
                impares[i] = nums[i];
            }
        }
        input.nextLine();

        System.out.println("Numeros: ");
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                System.out.println(nums[i]);
            }
        }

        System.out.println("Pares: ");
        for(int i = 0; i < pares.length; i++){
            if(pares[i] != 0){
                System.out.println(pares[i]);
            }
        }

        System.out.println("Impares: ");
        for(int i = 0; i < impares.length; i++){
            if(impares[i] != 0){
                System.out.println(impares[i]);
            }
        }

     }
}
