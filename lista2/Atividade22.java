package lista2;

import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor entre 1 e 1000: ");
        int num = input.nextInt();

        if (num < 1 || num > 1000){
            System.out.println("O valor deve ser entre 0 e 1000");
            System.exit(0);
        }

        int centenas;
        int dezenas;
        int unidades = 0;
        
        centenas = num / 100;
        num = num - centenas * 100;
        dezenas = num / 10;
        unidades = num - dezenas * 10;

        System.out.println("Centenas: " + centenas + ", Dezenas: " + dezenas + ", Unidades: " + unidades);

    }
}
