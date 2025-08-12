package lista2;

import java.util.Scanner;

public class Atividade30 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("""
                Qual o tipo de combustível?
                A-álcool,
                G-gasolina:""");
        String tipo = input.next();

        System.out.print("Quantos litros de combustível?");
        double litros = input.nextDouble();

        int desconto = 0;
        double precoLitro = 0;

        if (tipo.equalsIgnoreCase("A")) {
            if (litros < 20){
                desconto = 3;
            } else {
                desconto = 5;
            }

            precoLitro = (1.9 /100) * (100 - desconto);

        } else if (tipo.equalsIgnoreCase("G")) {
            if (litros < 20){
                desconto = 4;
            } else {
                desconto = 6;
            }

            precoLitro = (2.5 /100) * (100 - desconto);

        }
        double total = precoLitro * litros;

        System.out.println("Valor a pagar: " + total);

    }
}
