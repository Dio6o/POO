package misc;

import java.util.Scanner;

public class Matrizex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int LINHAS = 4;
        final int COLUNAS = 4;
        int[][] matriz = new int[LINHAS][COLUNAS];
        int soma = 0;

        for(int i = 0; i < LINHAS; i++){
            for(int j = 0; j < COLUNAS; j++){
                matriz[i][j] = input.nextInt();
            }
        }

        for(int i = 0; i < LINHAS; i++){
            for(int j = 0; j < COLUNAS; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
