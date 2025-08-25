package lista4;

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums = new int[5];
        int soma = 0;
        int produto = 1;

        for(int i = 0; i < nums.length; i++){
            System.out.print("Digite um numero: ");
            nums[i] = input.nextInt();
            soma += nums[i];
            produto *= nums[i];
        }

        System.out.println("Soma dos numeros: " + soma);
        System.out.println("Produto dos numeros: " + produto);
        System.out.println("Numeros digitados: ");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
