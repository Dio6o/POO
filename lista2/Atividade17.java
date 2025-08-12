package lista2;

import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float nota1 = input.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float nota2 = input.nextFloat();

        float media = (nota1 + nota2) / 2;

        String conceito = "";

        if (media > 9 && media <= 10){
            conceito = "A";
        } else if (media > 7.5 && media <= 9){
            conceito = "B";
        } else if (media > 6 && media <= 7.5){
            conceito = "C";
        } else if (media > 4 && media <= 6){
            conceito = "D";
        } else if (media <= 4){
            conceito = "E";
        }

        String status;

        switch (conceito){
            case "A", "B", "C":
                status = "Aprovado";
                break;
            case "D", "E":
                status = "Reprovado";
                break;
            default:
                status = "Erro.";
                break;
        }

        System.out.printf("""
                Primeira nota: %.1f,
                Segunda nota: %.1f,
                Média: %.1f,
                Conceito: %s,
                Status: %s.""", nota1, nota2, media, conceito, status);

    }
}
