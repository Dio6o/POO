package lista1;

import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora? ");
        float valorHora = input.nextFloat();

        System.out.print("Quantas horas você trabalhou no mês? ");
        float horasTrabalhadas = input.nextFloat();

        float salario = valorHora * horasTrabalhadas;

        System.out.printf("O valor do seu salário é de: R$ %.2f", salario);

    }
}
