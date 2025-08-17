package lista3;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String operacao;

        do {

            double paisA;
            double crescimentoA;
            double paisB;
            double crescimentoB;

            do {

                do {
                    System.out.print("Informe a população do país A: ");
                    paisA = input.nextDouble();
                    System.out.print("Informe a taxa de crescimento anual do país A: ");
                    crescimentoA = input.nextDouble() / 100;
                } while (paisA <= 0);

                do {
                    System.out.print("Informe a população do país B: ");
                    paisB = input.nextDouble();
                    System.out.print("Informe a taxa de crescimento anual do país B: ");
                    crescimentoB = input.nextDouble() / 100;
                } while (paisB <= 0);

                if (paisA > paisB) {
                    System.out.println("População do país A maior que a população do país B, tente novamente.");
                }

            } while (paisA > paisB);

            int anos = 0;

            while (paisB > paisA) {
                paisA = paisA + (paisA * crescimentoA);
                paisB = paisB + (paisB * crescimentoB);
                anos++;
            }

            input.nextLine();

            System.out.println("Levara " + anos + " anos para o país A ser mais populoso que o páis B.");

            System.out.println("Deseja continuar? ");
            operacao = input.nextLine();

        } while(operacao.equalsIgnoreCase("sim"));
    }
}
