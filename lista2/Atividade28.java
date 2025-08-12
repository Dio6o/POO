package lista2;

import java.util.Scanner;

public class Atividade28 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double num1 = input.nextDouble();

        System.out.print("Digite outro valor: ");
        double num2 = input.nextDouble();

        System.out.println("""
                Qual operação você deseja?,
                soma, subtracao, produto, divisao?""");
        String operacao = input.next();

        double resultado = 0;

        switch (operacao){
            case "soma":
                resultado = num1 + num2;
                break;
            case "subtracao":
                resultado = num1 - num2;
                break;
            case "produto":
                resultado = num1 * num2;
                break;
            case "divisao":
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Erro.");
                break;
        }

        System.out.println("Resultado: " + resultado);

        double decimal = resultado - Math.round(resultado);

        if (decimal == 0){
            System.out.println("Número inteiro.");
        } else {
            System.out.println("Número decimal.");
        }

    }
}
