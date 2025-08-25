package lista5;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;


public class Atividade1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int size;
        do{
            System.out.print("Informe o tamanho da matriz, valor impar entre 3 e 11: ");
            size = input.nextInt();
            if(size >= 3 && size <= 11){
                if(size % 2 != 0){
                    break;
                }
            }

        } while (true);

        int[][] matriz = new int[size][size];
        int valor = 0;
        int soma = 0;
        double media = 0;
        int menor = 0;
        int maior = 0;
        int pares = 0;
        int impares = 0;

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.printf("Informe o valor para a posicao %d, %d: ", i, j);
                valor = input.nextInt();
                matriz[i][j] = valor;

                soma += valor;
                media += valor;

                if(valor % 2 == 0){
                    pares++;
                } else{
                    impares++;
                }

                if(i == 0 && j == 0){
                    menor = valor;
                    maior = valor;
                }

                if(valor > maior){
                    maior = valor;
                }

                if(valor < menor){
                    menor = valor;
                }

            }
        }

        media /= Math.pow(size, 2);
        int diagonalPrincipal = 0;

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(i == j){
                    diagonalPrincipal += matriz[i][j];
                }
            }
        }

        int diagonalSecundaria = 0;
        int contadorX = 0;
        int contadorY = 2;

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(i == contadorX && j == contadorY){
                    diagonalSecundaria += matriz[i][j];
                    contadorX++;
                    contadorY--;
                }
            }
        }


        System.out.printf("""
                Soma dos elementos: %d,
                Media dos elementos: %.2f,
                Maior valor: %d,
                Menor valor: %d,
                Total de pares: %d,
                Total de impares: %d,
                Soma da diagonal principal: %d,
                Soma da diagonal secundaria: %d. \n""", soma, media, maior, menor, pares, impares,
                diagonalPrincipal, diagonalSecundaria);

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                    System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Deseja gravar esses dados em um arquivo? sim ou nao?");
        String resposta = input.next();

        if(resposta.equals("sim")){
            try {
                FileWriter writer = new FileWriter("saida.txt");
                writer.write("Soma dos elementos: " + soma);
                writer.write("\n");
                writer.write("Media dos elementos: " + df.format(media));
                writer.write("\n");
                writer.write("Maior valor: " + maior);
                writer.write("\n");
                writer.write("Menor valor: " + menor);
                writer.write("\n");
                writer.write("Total de pares: " + pares);
                writer.write("\n");
                writer.write("Total de impares: " + impares);
                writer.write("\n");
                writer.write("Soma da diagonal principal: " + diagonalPrincipal);
                writer.write("\n");
                writer.write("Soma da diagonal secundaria: " + diagonalSecundaria);
                writer.write("\n");

                for(int i = 0; i < size; i++){
                    for(int j = 0; j < size; j++){
                        writer.write(matriz[i][j] + " ");
                    }
                    writer.write("\n");
                }

                writer.close();
                System.out.println("Arquivo gravado com sucesso.");
            } catch (IOException e) {
                System.out.println("Erro ao gravar arquivo.");
                e.printStackTrace();
            }
        }
    }
}
