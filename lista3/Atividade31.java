package lista3;

import java.util.Scanner;

public class Atividade31 {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);

        int maisAlto = 0;
        int codigoMaisAlto = 0;

        int maisBaixo = 1000;
        int codigoMaisBaixo = 0;

        int altura = 0;
        int codigo = 0;

        for(int i = 0; i < 10; i++){
            System.out.print("Informe o código do aluno: ");
            codigo = input.nextInt();

            System.out.print("Informe a altura do aluno: ");
            altura = input.nextInt();

            if (maisAlto < altura){
                maisAlto = altura;
                codigoMaisAlto = codigo;
            } else if (maisBaixo > altura){
                maisBaixo = altura;
                codigoMaisBaixo = codigo;
            }
        }

        System.out.printf("""
                Número do aluno mais alto: %d, com uma altura de %d,
                Número do aluno mais baixo: %d, com uma altura de %d
                """, codigoMaisAlto, maisAlto, codigoMaisBaixo, maisBaixo);
    }
}
