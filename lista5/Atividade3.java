package lista5;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Informe a quantidade de alunos: ");
        int quantidade = input.nextInt();

        final int QUANTIDADEPROVAS = 2;
        double[][] alunos =  new double[quantidade][QUANTIDADEPROVAS];
        String[] nomes =  new String[quantidade];
        double[] medias = new double[quantidade];
        double media = 0;
        double mediaGeral = 0;
        double[] menorNota =  new double[2];
        double[] maiorNota =  new double[2];
        double nota = 0;

        for(int i = 0; i < quantidade; i++){
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = input.next();
            for(int j = 0; j < QUANTIDADEPROVAS; j++){
                System.out.print("Nota " + (j + 1) + " do aluno: ");
                nota = input.nextDouble();
                media += nota;
                mediaGeral += nota;
                alunos[i][j] = nota;

                if(i == 0 && j ==0){
                    menorNota[0] = i;
                    menorNota[1] = nota;

                    maiorNota[0] = i;
                    maiorNota[1] = nota;
                }

                if(nota > maiorNota[1]){
                    maiorNota[0] = i;
                    maiorNota[1] = nota;
                }

                if(nota < menorNota[1]){
                    menorNota[0] = i;
                    menorNota[1] = nota;
                }
            }
            medias[i] = media / QUANTIDADEPROVAS;
            media = 0;
        }

        mediaGeral /= quantidade * QUANTIDADEPROVAS;
        double[] menorMedia =  new double[2];
        double[] maiorMedia =  new double[2];

        for(int i = 0; i < quantidade; i++){
            System.out.print("Aluno " + nomes[i] + ", notas: ");

            for(int j = 0; j < QUANTIDADEPROVAS; j++){
                System.out.print(alunos[i][j] + " ");

            }

            System.out.println(", Media: " + medias[i] + ".");
            if(i == 0){
                menorMedia[0] = i;
                menorMedia[1] = medias[i];

                maiorMedia[0] = i;
                maiorMedia[1] = medias[i];
            }

            if(medias[i] > maiorMedia[1]){
                maiorMedia[0] = i;
                maiorMedia[1] = medias[i];
            }

            if(medias[i] < menorMedia[1]){
                menorMedia[0] = i;
                menorMedia[1] = medias[i];
            }

        }

        System.out.println("Maior nota da turma " + nomes[(int) maiorNota[0]] + ", " + maiorNota[1] + ".");
        System.out.println("Menor nota da turma " + nomes[(int) menorNota[0]] + ", " + menorNota[1] + ".");

        System.out.println("Maior media da turma " + nomes[(int) maiorMedia[0]] + ", " + maiorMedia[1] + ".");
        System.out.println("Menor media da turma " + nomes[(int) menorMedia[0]] + ", " + menorMedia[1] + ".");

        System.out.println("Media geral da turma: " + df.format(mediaGeral) + ".");

        for(int i = 0; i < quantidade; i++){
            if(medias[i] < mediaGeral){
                System.out.println("Aluno " + nomes[i] + " abaixo da media da media geral.");
            } else {
                System.out.println("Aluno " + nomes[i] + " acima da media da media geral.");
            }

        }

        System.out.print("Deseja gravar esses dados em um arquivo? sim ou nao?");
        String resposta = input.next();

        if(resposta.equals("sim")){
            try {
                FileWriter writer = new FileWriter("saida.txt");

                for(int i = 0; i < quantidade; i++) {
                    writer.write("Aluno " + nomes[i] + ", notas: ");
                    for (int j = 0; j < QUANTIDADEPROVAS; j++) {
                        writer.write(alunos[i][j] + " ");

                    }
                    writer.write(", Media: " + medias[i] + ". \n");
                }

                writer.write("Maior nota da turma " + nomes[(int) maiorNota[0]] + ", " + maiorNota[1] + ". \n");
                writer.write("Menor nota da turma " + nomes[(int) menorNota[0]] + ", " + menorNota[1] + ". \n");

                writer.write("Maior media da turma " + nomes[(int) maiorMedia[0]] + ", " + maiorMedia[1] + ". \n");
                writer.write("Menor media da turma " + nomes[(int) menorMedia[0]] + ", " + menorMedia[1] + ". \n");

                writer.write("Media geral da turma: " + df.format(mediaGeral) + ". \n");

                for(int i = 0; i < quantidade; i++){
                    if(medias[i] < mediaGeral){
                        writer.write("Aluno " + nomes[i] + " abaixo da media da media geral. \n");
                    } else {
                        writer.write("Aluno " + nomes[i] + " acima da media da media geral. \n");
                    }
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
