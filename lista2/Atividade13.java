package lista2;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = input.nextDouble();

        System.out.print("Informe o valor por hora: ");
        double valorHora = input.nextDouble();

        double salario = valorHora * horasTrabalhadas;
        double sindicato = salario * 0.05;
        double fgts = salario * 0.11;
        double inss = salario * 0.1;

        double impostoRenda;
        int porcentagemImpostoRenda;

        if (salario <= 900){
            impostoRenda = 0;
            porcentagemImpostoRenda = 0;
        } else if (salario <= 1500){
            impostoRenda = salario * 0.05;
            porcentagemImpostoRenda = 5;
        } else if (salario <= 2500){
            impostoRenda = salario * 0.1;
            porcentagemImpostoRenda = 10;
        } else {
            impostoRenda = salario * 0.20;
            porcentagemImpostoRenda = 20;
        }

        double descontos = inss + impostoRenda;
        double salarioLiquido = salario - descontos;

        System.out.printf("""
                Salario bruto: R$ %.2f,
                (-) IR (%d%%): R$ %.2f,
                (-) INSS (11%%): R$ %.2f,
                Sindicato:  R$ %.2f,
                FGTS: R$ %.2f,
                Total de descontos: R$ %.2f,
                Salario Líquido: R$ %.2f,
                """, salario, porcentagemImpostoRenda, impostoRenda, inss, sindicato, fgts, descontos, salarioLiquido);
    }
}
