package lista4;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] notas = new double[4];
        double nota = 0;
        double media = 0;

        for(int i = 0; i < 4; i++){
            System.out.print("Digite a nota: ");
            nota = input.nextInt();
            notas[i] = nota;
            media += nota;
        }

        media = media/4;

        for(int i = 0; i < 4; i++){
            System.out.print(notas[i] + " ");
        }

        System.out.println("Média: " + media);

    }
}
