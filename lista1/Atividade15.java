package lista1;

import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o tamanho da parede em metros quadrados?: ");
        float tamanhoParede = input.nextFloat();

        float quantidadeTinta = tamanhoParede / 3;

        float quantidadeBaldes = quantidadeTinta / 18;

        float valorTinta = quantidadeBaldes * 80;

        System.out.printf("Serão necessários %.2f baldes de tinta\n" +
                "com um valor de: R$ %.2f", quantidadeBaldes,  valorTinta);
    }
}
