package lista1;

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora?");
        float valorHora = input.nextFloat();

        System.out.print("Quantas horas você trabalhou no mês? ");
        float horasTrabalhadas = input.nextFloat();

        float salarioBruto = valorHora * horasTrabalhadas;

        float impostoRenda = (salarioBruto / 100) * 11;

        float inss = (salarioBruto / 100) * 8;

        float sindicato = (salarioBruto / 100) * 5;

        float descontos = impostoRenda + inss + sindicato;

        float salarioLiquido = salarioBruto - descontos;

        System.out.printf("""
                Valor do Salario bruto: R$ %.2f
                Valor do imposto de renda: R$ %.2f
                Valor do INSS: R$ %.2f
                Valor do sindicato: R$ %.2f
                Valor total dos descontos: R$ %.2f
                Valor do salario líquido: R$ %.2f
                """, salarioBruto, impostoRenda,inss, sindicato, descontos, salarioLiquido);

    }
}
