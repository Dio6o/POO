package lista3;

import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor entre 1 e 10: ");
        int valor = input.nextInt();

        System.out.println("Tabuada do " + valor + ":");
        for(int x = 1; x <= 10; x++){
            System.out.println(valor + " x " + x + " = " + x * valor);
        }
    }
}
