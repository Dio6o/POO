package lista3;

import java.util.Scanner;

public class Atividade36 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("""
                Códigos dos candidatos:
                1: Jose,
                2: Pedro,
                3: Gabriel,
                4: Maria,
                5: Voto nulo,
                6: Voto em branco,
                0: Para finalizar a contagem.
                """);

        int totalVotos = 0;
        int total1 = 0;
        int total2 = 0;
        int total3 = 0;
        int total4 = 0;
        int totalNulo = 0;
        int totalEmBranco = 0;
        double porcentagemNulos = 0;
        double porcentagemBranco = 0;

        do{
            System.out.print("Informe o código do candidato: ");
            int codigo = input.nextInt();

            if (codigo == 0){
                System.out.println("Contagem finalizada.");
                break;
            }

            if (codigo == 1){
                total1++;
            } else if (codigo == 2){
                total2++;
            } else if (codigo == 3){
                total3++;
            } else if (codigo == 4){
                total4++;
            } else if (codigo == 5){
                totalNulo++;
            } else if (codigo == 6){
                totalEmBranco++;
            }

            totalVotos++;

        } while (true);

        porcentagemNulos = (double) (totalNulo * 100) / totalVotos;
        porcentagemBranco= (double) (totalEmBranco * 100) / totalVotos;

        System.out.printf("""
                Total de votos: %d,
                Total de votos candidato 1: %d,
                Total de votos candidato 2: %d,
                Total de votos candidato 3: %d,
                Total de votos candidato 4: %d,
                Total de votos nulos: %d,
                Total de votos em branco: %d,
                Percentual de votos nulos: %.2f%%,
                Percentual de votos em branco: %.2f%%.
                """, totalVotos, total1, total2, total3, total4, totalNulo, totalEmBranco,
                porcentagemNulos, porcentagemBranco);

    }
}
