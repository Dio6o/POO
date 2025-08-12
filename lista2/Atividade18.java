package lista2;

import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] ags){
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o tamanho do lado A: ");
        double ladoA = input.nextDouble();

        System.out.print("Informe o tamanho do lado B: ");
        double ladoB = input.nextDouble();

        System.out.print("Informe o tamanho do lado C: ");
        double ladoC = input.nextDouble();

        boolean trinagulo = ladoA + ladoB > ladoC;

        String tipoTrinangulo;

        if(trinagulo){
            if (ladoA == ladoB && ladoA == ladoC){
                System.out.println("Triângulo Equilátero.");
            } else if (ladoA == ladoB || ladoA == ladoC) {
                System.out.println("Triângulo Isósceles.");
            } else if (ladoA != ladoB && ladoB != ladoC) {
                System.out.println("Triângulo Escaleno.");
            }
        } else {
            System.out.println("Não é triângulo.");
        }

    }
}
