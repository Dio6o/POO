package lista3;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;

        do {
            System.out.print("Informe seu nome: ");
            nome = input.nextLine();
        } while (nome.length() < 3);

        int idade;

        do {
            System.out.print("Informe sua idade: ");
            idade = input.nextInt();
        } while (idade < 0 || idade > 150);

        double salario;

        do {
            System.out.print("Informe seu salário: ");
            salario = input.nextDouble();
        } while (salario < 0);

        input.nextLine();

        String sexo;

        do {
            System.out.print("Informe seu sexo: ");
            sexo = input.nextLine();
        } while (!sexo.equals("m") && !sexo.equals("f"));

        String estadoCivil;

        do {
           System.out.print("Informe seu estado civil: ");
           estadoCivil = input.nextLine();
        } while (!estadoCivil.equals("s") && !estadoCivil.equals("c") &&
                !estadoCivil.equals("v") && !estadoCivil.equals("d"));

    }
}
