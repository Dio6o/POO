package lista1;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args){
        Scanner input = new Scanner( System.in);

        System.out.print("Informe a primeira nota: ");
        float nota1 = input.nextFloat();

        System.out.print("Informe a segunda nota: ");
        float nota2 = input.nextFloat();

        System.out.print("Informe a terceira nota: ");
        float nota3 = input.nextFloat();

        System.out.print("Informe a quarta nota: ");
        float nota4 = input.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.printf("A média do aluno foi de: %f", media);

    }
}
