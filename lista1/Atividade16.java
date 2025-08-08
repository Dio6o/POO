package lista1;

import java.util.Scanner;

public class Atividade16 {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.print("Qual o tamanho da parede em metros quadrados?: ");
            float tamanhoParede = input.nextFloat();

            float quantidadeTinta = tamanhoParede / 6;

            float quantidadeBaldes = quantidadeTinta / 18;
            float valorBaldes = quantidadeBaldes * 80;

            double quantidadeGaloes = quantidadeTinta / 3.6;
            double valorGaloes = quantidadeGaloes * 25;

            System.out.printf("""
                    Serão necessários %.2f litros de tinta.
                    Custando um total de R$ %.2f se for comprada em baldes 
                    ou custando R$ %.2f caso seja comprada em galões.
                    """, quantidadeTinta, valorBaldes, valorGaloes);
        }
}
