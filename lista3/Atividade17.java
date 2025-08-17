package lista3;

import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = input.nextInt();

        if ((valor % 2 !=0 && valor % 3 != 0) || (valor == 2 || valor == 3)){
            System.out.println(valor + " é um número primo.");
        } else {
            System.out.println(valor + " não é um número primo.");

        }
    }
}
