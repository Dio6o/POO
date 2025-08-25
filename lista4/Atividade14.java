package lista4;

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int LINHA = 30;
        final int COLUNA = 2;
        double[][] alunos = new double[LINHA][COLUNA];
        double media = 0;
        double idade = 0;
        double altura = 0;

        for(int i = 0; i < LINHA; i++){
            System.out.print("Informe a idade do aluno " + (i+1) + ": ");
            idade = input.nextDouble();
            alunos[i][0] = idade;

            System.out.print("Informe a altura do aluno " + (i+1) + ": ");
            altura = input.nextDouble();
            alunos[i][1] = altura;
            media += altura;
        }

        media /= LINHA;


        for(int j = 0; j < LINHA; j++){
            idade = alunos[j][0];
            altura = alunos[j][1];
            if(idade > 13){
                if(altura < media){
                    System.out.println("Aluno " + (j + 1) +" com a altura abaixo da media.");
                }
            }
        }


    }
}
