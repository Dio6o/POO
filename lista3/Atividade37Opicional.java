package lista3;

import java.util.Scanner;

public class Atividade37Opicional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String continuar;
        String resposta;
        int nota = 0;
        int totalAlunos = 0;
        double mediaAlunos = 0;
        int menorNota = 1000;
        int maiorNota = -100;

        System.out.println("Infrome o gabarito da prova: ");

        StringBuilder gabarito = new StringBuilder();

        for(int i = 1; i <= 10 ; i++){
            System.out.printf("Digite a resposta da questão %d: ", i);
            gabarito.append(input.nextLine());
        }

        String correta;
        do {
            System.out.print("Deseja calcular a nota de um alunos? \n 'Sim' para continuar, 'Não' para finalizar. \n-> ");
            continuar = input.next();
            input.nextLine();

            if (continuar.equalsIgnoreCase("sim")) {
                nota = 0;

                for(int i = 0; i < 10 ; i++){
                    correta = String.valueOf(gabarito.charAt(i));
                    System.out.printf("Informe a resposta do aluno para a questão %d: ", i+1);
                    resposta = input.next();

                    if(resposta.equals(correta)){
                        nota++;
                    }
                }

                totalAlunos++;
                System.out.println("Nota do aluno: " + nota);

                mediaAlunos += nota;

                if (nota < menorNota) {
                    menorNota = nota;
                } else if (nota > maiorNota) {
                    maiorNota = nota;
                }

            } else {
                System.out.println("Programa finalizado.");
                break;
            }

        } while (true);

        mediaAlunos = mediaAlunos / totalAlunos;

        System.out.printf("""
                Maior nota da sala: %d,
                Menor nota da sala: %d,
                Total de alunos que utilizaram o sistema: %d,
                Média da turma: %.2f""", maiorNota, menorNota, totalAlunos, mediaAlunos);
    }
}