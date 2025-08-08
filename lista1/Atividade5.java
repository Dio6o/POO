package lista1;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o comprimento em metros: ");
        float comprimento = input.nextFloat();

        float conversao = comprimento * 100;

        System.out.printf("O comprimento convertido para centímentros é de: %.1f", conversao);
    }
}
