package lista3;

import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Qual a quantidade de CDs para calcular? ");
        int n = input.nextInt();
        double soma = 0;
        double valor = 0;

        for(int i = 1; i <= n; i++){
            System.out.printf("Informe informe o valor do Cd %d: ", i);
            valor = input.nextDouble();
            soma += valor;
        }

        double media = soma/ (double) n;

        System.out.printf("""
                O valor total  investido foi de: R$ %.2f,
                o valor médio gasto por CD foi de R$%.2f.
                """,soma, media);
    }
}
