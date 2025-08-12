package lista2;

import java.util.Scanner;

public class Atividade29 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Perguntas sobre o crime:");

        String resposta = "";

        System.out.print("Telefonou para a vítima? ");
        resposta = input.next();

        int resultado = 0;

        if (resposta.equalsIgnoreCase("sim")) {
            resultado = 1;
        }

        System.out.print("Esteve no local do crime? ");
        resposta = input.next();

        if (resposta.equalsIgnoreCase("sim")) {
            resultado = resultado + 1;
        }

        System.out.print("Mora perto da vítima? ");
        resposta = input.next();

        if (resposta.equalsIgnoreCase("sim")) {
            resultado = resultado + 1;
        }

        System.out.print("Devia para a vítima? ");
        resposta = input.next();

        if (resposta.equalsIgnoreCase("sim")) {
            resultado = resultado + 1;
        }

        System.out.print("Já trabalhou com a vítima? ");
        resposta = input.next();

        if (resposta.equalsIgnoreCase("sim")) {
            resultado = resultado + 1;
        }

        if (resultado == 2) {
            System.out.println("Suspeita.");
        } else if (resultado == 3 || resultado == 4) {
            System.out.println("Cúmplice.");
        } else if (resultado == 5){
            System.out.println("Assasino.");
        } else {
            System.out.println("Inocente.");
        }
    }
}
