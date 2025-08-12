package lista2;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe seu salário: ");
        double salario = input.nextDouble();

        double salarioFinal = 0;
        double aumento = 0;
        int porcento;

        if (salario <= 280){
            porcento = 20;
            aumento = salario * 0.2;
            salarioFinal = salario + aumento;

        } else if ( 700 > salario) {
            porcento = 15;
            aumento = salario * 0.15;
            salarioFinal = salario + aumento;

        } else if (1500 > salario){
            porcento = 10;
            aumento = salario * 0.1;
            salarioFinal = salario + aumento;

        } else {
            porcento = 5;
            aumento = salario * 0.05;
            salarioFinal = salario + aumento;
        }

        System.out.printf("""
                Salario antes do reajuste: R$ %.2f,
                Percentual de aumento: %d%%
                Valor do aumento: R$ %.2f,
                Novo salário após o aumento: R$ %.2f
                """,salario, porcento, aumento, salarioFinal);
    }
}