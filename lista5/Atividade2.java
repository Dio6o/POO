package lista5;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int MERCADOS = 5;
        final int PRODUTOS = 5;
        double[][] matriz = new double[MERCADOS][PRODUTOS];
        double[] mediaProdutos = new double[PRODUTOS];
        double[] mediaMercados = new double[PRODUTOS];
        double produto;
        double totalMercado = 0;

        for(int i = 0; i < MERCADOS; i++){
            System.out.println("Informe os precos dos produtos no mercado " + (i+1) + ": ");
            for(int j = 0; j < PRODUTOS; j++){
                System.out.print("Informe o precos do produto " + (j+1) + ": ");
                produto = input.nextDouble();
                matriz[i][j] = produto;
                mediaProdutos[j] += produto;
                totalMercado += produto;
            }
            mediaMercados[i] = totalMercado;
            totalMercado = 0;
        }

        System.out.println("Precos por supermercado: ");
        for(int i = 0; i < MERCADOS; i++){
            System.out.print("Produtos do mercado " + (i+1) + ": ");
            for(int j = 0; j < PRODUTOS; j++){
                produto = matriz[i][j];
                System.out.print(produto + " ");
            }
            System.out.println();
        }

        System.out.println("Media de precos pro produto: ");
        for(int i = 0; i < PRODUTOS; i++){
            System.out.println("Produto " + (i+1) + ": " + (mediaProdutos[i] / MERCADOS));
        }

        double barato = 0;
        double caro = 0;

        System.out.println("Soma dos produtos por mercado: ");
        for(int i = 0; i < MERCADOS; i++){
            System.out.println("Soma por mercado " + (i+1) + ": " + mediaMercados[i]);
            if(i == 0){
                barato = mediaMercados[0];
                caro = mediaMercados[0];
            }

            if(caro < mediaMercados[i]){
                caro = mediaMercados[i];
            }

            if(barato > mediaMercados[i]){
                barato = mediaMercados[i];
            }
        }

        System.out.println("Media de produtos do mercado mais caro: " + caro);
        System.out.println("Media de produtos do mercado mais barato: " + barato);

        System.out.print("Deseja gravar esses dados em um arquivo? sim ou nao?");
        String resposta = input.next();

        if(resposta.equals("sim")){
            try {
                FileWriter writer = new FileWriter("saida.txt");
                System.out.println("Precos por supermercado: ");
                for(int i = 0; i < MERCADOS; i++){
                    writer.write("Produtos do mercado " + (i+1) + ": ");
                    for(int j = 0; j < PRODUTOS; j++){
                        produto = matriz[i][j];
                        writer.write(produto + " ");
                    }
                    writer.write("\n");
                }

                writer.write("Media de precos pro produto: \n");
                for(int i = 0; i < PRODUTOS; i++){
                    writer.write("Produto " + (i+1) + ": " + (mediaProdutos[i] / MERCADOS) + "\n");
                }

                writer.write("Soma dos produtos por mercado: \n");
                for(int i = 0; i < MERCADOS; i++){
                    writer.write("Soma por mercado " + (i+1) + ": " + mediaMercados[i] + "\n");
                }

                writer.write("Media de produtos do mercado mais caro: " + caro + "\n");
                writer.write("Media de produtos do mercado mais barato: " + barato + "\n");
                writer.close();
                System.out.println("Arquivo gravado com sucesso.");
            } catch (IOException e) {
                System.out.println("Erro ao gravar arquivo.");
                e.printStackTrace();
            }
        }

    }
}
