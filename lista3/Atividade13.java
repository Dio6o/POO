package lista3;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para calcular seu fatorial: ");
        int last = input.nextInt();
        int posi = last;
        int fac = 1;

        for(int i = 1; i < posi; i++) {
            fac = i * last;
            last = fac;

        }

        System.out.printf("fatorial de %d: %d", posi, fac);
    }
}
