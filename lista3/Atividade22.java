package lista3;

import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de votantes: ");
        int votantes = input.nextInt();

        input.nextLine();

        int candidatoA = 0;
        int candidatoB = 0;
        int candidatoC = 0;
        String voto = "";

        for (int i = 1; i <= votantes; i++){
            System.out.print("Escolha o candidato A, B ou C: ");
            voto = input.nextLine();

            if (voto.equalsIgnoreCase("A")){
                candidatoA++;
            } else if (voto.equalsIgnoreCase("B")){
                candidatoB++;
            } else if (voto.equalsIgnoreCase("C")){
                candidatoC++;
            }
        }

        System.out.printf("""
                Quantidade de votos de cada candidato:
                A: %d,
                B: %d,
                C: %d.1
                """, candidatoA, candidatoB, candidatoC);
    }
}
