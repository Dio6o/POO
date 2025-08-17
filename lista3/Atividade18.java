package lista3;

import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = input.nextInt();

        if ((valor % 2 !=0 && valor % 3 != 0) || (valor == 2 || valor == 3)){
            System.out.println(valor + " é um número primo.");
        } else {
            System.out.println(valor + " não é um número primo, mas é divisível pelos seguintes números: ");
            for (int i = 1; i <= valor; i++) {
                if(valor % i == 0){
                    System.out.print(i + " ");
                }
            }
        }


    }
}
