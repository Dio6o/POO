package lista2;

import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a primeira idade: ");
        int idade1 = input.nextInt();

        System.out.print("Informe a segunda idade: ");
        int idade2 = input.nextInt();

        System.out.print("Informe a terceira idade: ");
        int idade3 = input.nextInt();

        double mediaIdades = (double) (idade1 + idade2 + idade3) / 3;

        if (mediaIdades < 25){
            System.out.println("Turma Jovem.");
        } else if (mediaIdades <= 40){
            System.out.println("Turma Adulta.");
        } else {
            System.out.println("Turma Idosa");
        }

    }
}
