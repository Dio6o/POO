package lista3;

import java.util.Scanner;

public class Atividade37 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String continuar;
        String resposta;
        int nota = 0;
        int totalAlunos = 0;
        double mediaAlunos = 0;
        int menorNota = 1000;
        int maiorNota = -100;

        do{
            System.out.print("Deseja calcular a nota de um alunos? \n 'Sim' para continuar, 'Não' para finalizar. \n-> ");
            continuar = input.next();
            input.nextLine();

            if(continuar.equalsIgnoreCase("sim")){
                for (int i = 1; i <= 10; i++ ) {
                    System.out.print("Resposta " + i + "-> ");
                    resposta = input.nextLine();

                    switch(resposta.toLowerCase()){
                        case "a":
                            if(i == 1 || i == 10){
                                nota++;
                            }
                            break;
                        case "b":
                            if(i == 2 || i == 9){
                                nota++;
                            }
                            break;
                        case "c":
                            if(i == 3 || i == 8){
                                nota++;
                            }
                            break;
                        case "d":
                            if(i == 4 || i == 7){
                                nota++;
                            }
                            break;
                        case "e":
                            if(i == 5 || i == 6){
                                nota++;
                            }
                            break;
                    }

                }
                totalAlunos ++;
                System.out.println("Nota do aluno: " + nota);

                mediaAlunos += nota;

                if (nota < menorNota){
                    menorNota = nota;
                } else if (nota > maiorNota){
                    maiorNota = nota;
                }

            } else {
                System.out.println("Programa finalizado.");
                break;
            }

        } while(true);

        mediaAlunos = mediaAlunos /totalAlunos;

        System.out.printf("""
                Maior nota da sala: %d,
                Menor nota da sala: %d,
                Total de alunos que utilizaram o sistema: %d,
                Média da turma: %.2f""", maiorNota, menorNota, totalAlunos, mediaAlunos);
    }
}
