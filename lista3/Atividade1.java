package lista3;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma nota entre zero e dez: ");
        double valor = input.nextDouble();

        while (valor < 0 || valor > 10){
            System.out.print("Valor inválido, digite um valor válido: ");
            valor = input.nextDouble();
        }

    }
}
