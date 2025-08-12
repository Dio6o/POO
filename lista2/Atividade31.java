package lista2;

import java.util.Scanner;

public class Atividade31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos Kgs de morangos? ");
        double quantidadeMorangos = input.nextDouble();

        double precoMorango;

        if (quantidadeMorangos < 5){
            precoMorango = 2.5;
        } else {
            precoMorango = 2.2;
        }

        System.out.print("Quantos Kgs de maçã? ");
        double quantidadeMaca = input.nextDouble();

        double precoMaca;

        if (quantidadeMaca < 5){
            precoMaca = 1.8;
        } else {
            precoMaca = 1.5;
        }

        double total = (precoMorango * quantidadeMorangos) + (precoMaca *  quantidadeMaca);

        if (total > 25 || (quantidadeMorangos + quantidadeMaca) > 8) {
            total = total - (total * 0.1);
        }

        System.out.println("Total da compra: " + total);

    }
}
