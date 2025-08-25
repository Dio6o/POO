package lista5;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num;
        final int SIZE = 6;
        int[] numSorteados = new int[SIZE];

        System.out.print("Quantas cartelas deseja preencer? ");
        int quantidade = input.nextInt();
        double f;
        int[][] cartelas = new int[quantidade][SIZE];

        for (int i = 0; i < quantidade; i++) {
            for (int j = 0; j < SIZE; j++) {
                f = Math.random() / Math.nextDown(1.0);
                num = 1 * (1.0 - f) + 61 * f;
                cartelas[i][j] = (int) num;
            }
            Arrays.sort(cartelas[i]);

            for (int l = 0; l < cartelas[i].length - 1; l++) {
                for (int m = l + 1; m < cartelas[i].length; m++) {
                    if (cartelas[i][m] == cartelas[i][l]) {
                        for (int k = 0; k < SIZE; k++) {
                            f = Math.random() / Math.nextDown(1.0);
                            num = 1 * (1.0 - f) + 61 * f;
                            cartelas[i][k] = (int) num;
                        }
                        Arrays.sort(cartelas[i]);
                        m--;
                    }
                }
            }
        }

        for (int i = 0; i < 1; i++) {
            for (int l = 0; l < numSorteados.length - 1; l++) {
                for (int m = l + 1; m < numSorteados.length; m++) {
                    if (numSorteados[m] == numSorteados[l]) {
                        for (int k = 0; k < SIZE; k++) {
                            f = Math.random() / Math.nextDown(1.0);
                            num = 1 * (1.0 - f) + 61 * f;
                            numSorteados[k] = (int) num;
                        }
                        Arrays.sort(numSorteados);
                        i--;
                    }
                }
            }
        }


        Arrays.sort(numSorteados);
        System.out.println("Numeros sorteados: ");

        for(int i = 0; i < SIZE; i++){
            System.out.print(numSorteados[i] + " ");
        }

        System.out.println();

        int contador = 0;

        System.out.println("Cartelas preenchidas: ");
        for (int i = 0; i < quantidade; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(cartelas[i][j] + " ");
                if (cartelas[i][j] == numSorteados[j]){
                    contador++;
                }
            }
            System.out.print(", acertos na cartela: " + contador + "\n");
            contador = 0;
        }

        System.out.print("Deseja gravar esses dados em um arquivo? sim ou nao? ");
        String resposta = input.next();

        if(resposta.equals("sim")){
            try {
                FileWriter writer = new FileWriter("saida.txt");

                writer.write("Numeros sorteados: \n");

                for(int i = 0; i < SIZE; i++){
                    writer.write(numSorteados[i] + " ");
                }

                writer.write("\n");

                writer.write("Cartelas preenchidas: \n");
                for (int i = 0; i < quantidade; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        writer.write(cartelas[i][j] + " ");
                        if (cartelas[i][j] == numSorteados[j]){
                            contador++;
                        }
                    }
                    writer.write(", acertos na cartela: " + contador + "\n");
                    contador = 0;
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
