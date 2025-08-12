package lista2;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();

        if (num  < 0)
            System.out.printf("%d, valor negativo.", num);
        else if (num == 0)
            System.out.printf("%d, valor igual a zero.", num);
        else
            System.out.printf("%d, valor positivo.", num);
    }
}
