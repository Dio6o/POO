package lista5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de altletas: ");
        int quantidadeAltletas = input.nextInt();

        final int quantidadeSaltos = 5;

        double[][] saltosAtletas = new double[quantidadeAltletas][quantidadeSaltos];

        int j = 0;

        do {
            System.out.println("Informe a distancia dos saltos do atleta " + (j + 1) + ": ");
            for (int i = 0; i < quantidadeSaltos; i++) {
                System.out.print("Distancia do salto " + (i + 1) + ": ");
                saltosAtletas[j][i] = input.nextDouble();

            }
            j++;

        } while ( j < quantidadeAltletas);

        double[] medias =  new double[quantidadeAltletas];
        double media = 0;
        double menor = 0;
        double salto = 0;

        for (int i = 0; i < quantidadeAltletas; i++) {
            for(int k = 0; k < quantidadeSaltos; k++){

                salto = saltosAtletas[i][k];
                media += salto;

                if (i == 0 && k == 0){
                    menor = salto;
                }

                if (salto < menor){
                    menor = salto;
                }
            }

            media -= menor;
            media /= (quantidadeSaltos - 1);
            medias[i] = media;
            media = 0;
        }

        double primeiro = 0;
        double ultimo = 0;

        for(int i = 0; i < quantidadeAltletas; i++){
            System.out.println("Saltos do atleta " + (i + 1) + ": ");
            for(int k = 0; k < quantidadeSaltos; k++){
                System.out.print(saltosAtletas[i][k] + ", ");
            }
            System.out.println();
            System.out.print("Media dos saltos: " + medias[i] + "\n");

            if (i == 0){
                primeiro = medias[i];
                ultimo = medias[i];
            }

            if (primeiro < medias[i]){
                primeiro = medias[i];
            }

            if (ultimo > medias[i]){
                ultimo = medias[i];
            }
        }

        System.out.print("Media de saltos do campeao: " + primeiro + "\n");
        System.out.print("Media de saltos do ultimo lugar: " + ultimo + "\n");

        System.out.print("Deseja gravar esses dados em um arquivo? sim ou nao? ");
        String resposta = input.next();

        if(resposta.equals("sim")){
            try {
                FileWriter writer = new FileWriter("saida.txt");

                for(int i = 0; i < quantidadeAltletas; i++) {
                    writer.write("Saltos do atleta " + (i + 1) + ": ");
                    for (int k = 0; k < quantidadeSaltos; k++) {
                        writer.write(saltosAtletas[i][k] + ", ");
                    }
                    writer.write("\n");
                    writer.write("Media dos saltos: " + medias[i] + "\n");
                }

                writer.write("Media de saltos do campeao: " + primeiro + "\n");
                writer.write("Media de saltos do ultimo lugar: " + ultimo + "\n");

                writer.close();
                System.out.println("Arquivo gravado com sucesso.");
            } catch (IOException e) {
                System.out.println("Erro ao gravar arquivo.");
                e.printStackTrace();
            }
        }

    }
}
