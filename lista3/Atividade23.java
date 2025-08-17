package lista3;

import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual a quantidade de turmas? ");
        int qtdTurmas = input.nextInt();
        int totalAlunos = 0;
        int qtdAlunos = 0;

        for(int i = 1; i <= qtdTurmas; i++){
            System.out.printf("Informe a quantidade de alunos na turma %d: ", i);
            qtdAlunos = input.nextInt();
            if (qtdAlunos > 40){
                System.out.println("Quantidade de alunos acima do limite!, tente novamente.");
                i--;
            } else {
                totalAlunos += qtdAlunos;
            }
        }

        double media = (double) totalAlunos / qtdTurmas;
        System.out.printf("A média de alunos por turma foi de: %.2f\n", media);

    }
}
