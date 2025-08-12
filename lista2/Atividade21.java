package lista2;

import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o dia: ");
        int dia = input.nextInt();

        System.out.print("Informe o mês: ");
        int mes = input.nextInt();

        System.out.print("Informe o ano: ");
        int ano = input.nextInt();

        if (dia > 0 && dia <= 31){
            if (mes > 0 && mes <= 12){
                if (ano > 0 && ano < 10000){
                    System.out.println("Data válida!");
                }
            }
        }
    }
}
