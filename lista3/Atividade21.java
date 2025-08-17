package lista3;

import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);

        System.out.print("Qual a quantidade de pessoas para calcular? ");
        int n = input.nextInt();
        int soma = 0;
        int idade = 0;

        for(int i = 1; i <= n; i++){
            System.out.printf("Informe a idade da pessoa %d: ", i);
            idade = input.nextInt();
            soma += idade;
        }

        double media = soma/ (double) n;

        if (media <= 25){
            System.out.println("Turma de jovens.");
        } else if (media <= 60){
            System.out.println("Turma de adultos.");
        } else if (media > 60){
            System.out.println("Turma de idosos.");
        }


    }
}
