package lista3;

import java.util.Scanner;

public class Atividade33 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor da dívida: ");
        double valorDivida = input.nextDouble();
        double valorInicial = valorDivida;
        int qtdParcelas = 3;
        int porcentagem = 10;
        double juros;

        System.out.printf("""
                    Valor da Dívida Valor dos Juros Quantidade de Parcelas Valor da Parcela
                    R$ %.2f, R$ 0.00, 1, R$ %.2f
                    """, valorDivida, valorDivida);

        for(int i = 1; i < 5; i++){
            juros = valorDivida * ((double) porcentagem / 100);
            valorDivida += juros;

            System.out.printf("""
                    R$ %.2f, R$ %.2f, %d, R$ %.2f
                    """, valorDivida, (valorDivida - valorInicial), qtdParcelas, (valorDivida / qtdParcelas));
            qtdParcelas += 3;
            porcentagem += 5;

        }

    }
}
