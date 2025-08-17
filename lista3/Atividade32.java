package lista3;

import java.util.Scanner;

public class Atividade32 {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);

        int codigo = 0;
        int numVeiculos = 0;
        int numAcidentes = 0;

        int menorIndice = 100000;
        int maiorIndiceCodigo = 0;
        int maiorIndice = -1;
        int menorIndiceCodigo = 0;

        double mediaVeiculos = 0;
        double mediaAcidentesCidades = 0;
        int contador = 0;

        for(int i = 0; i < 5; i++){
            System.out.print("Informe o código da cidade: ");
            codigo = input.nextInt();

            System.out.print("Informe a quantidade de veículos de passeio na cidade: ");
            numVeiculos = input.nextInt();

            System.out.print("Informe Número de acidentes de trânsito com vítimas na cidade: ");
            numAcidentes = input.nextInt();

            mediaVeiculos += numVeiculos;

            if (numAcidentes > maiorIndice){
                maiorIndiceCodigo = codigo;
                maiorIndice = numAcidentes;
            }

            if (numAcidentes < menorIndice){
                menorIndiceCodigo = codigo;
                menorIndice = numAcidentes;
            }

            if (numVeiculos < 2000){
                mediaAcidentesCidades += numAcidentes;
                contador++;
            }

        }

        mediaVeiculos = mediaVeiculos / 5;
        mediaAcidentesCidades = mediaAcidentesCidades / contador;

        System.out.printf("""
                Maior índice de acidentes de trânsito: %d, na cidade: %d,
                Menor índice de acidentes de trânsito: %d, na cidade: %d,
                Média de veículos nas cinco cidades: %.2f,
                Média de acidentes de trânsito nas cidades com menos de 2.000 veículos: %.2f.
                """, maiorIndice, maiorIndiceCodigo, menorIndice, menorIndiceCodigo, mediaVeiculos,
                mediaAcidentesCidades);


    }
}
