package lista4;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int qtdMedias = 10;
        double[] medias = new double[qtdMedias];
        double nota = 0;
        double media = 0;
        int qtdNotas = 4;
        double totalNotas = 0;
        int mediaAcima = 0;

        for(int i = 0; i < qtdMedias; i++){
            System.out.println("Digite as notas do aluno " + (i + 1) + ":");
            for(int j = 0; j < qtdNotas; j++){
                System.out.print("Digite uma nota: ");
                nota = input.nextDouble();
                totalNotas += nota;
            }
            media = totalNotas/qtdNotas;
            medias[i] = media;

            if(medias[i] >= 7){
                mediaAcima++;
            }
        }

        System.out.print("Alunos com média maior ou igual a 7.0: " +  mediaAcima);

    }
}
