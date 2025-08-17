package lista3;

import java.util.Scanner;

public class Atividade38 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero inteiro positivo: ");
        String numero = input.nextLine();
        StringBuilder inverso = new StringBuilder();
        for(int i = numero.length()-1; i >= 0; i--){
            inverso.append(numero.charAt(i));
        }

        System.out.print(inverso);
    }
}
