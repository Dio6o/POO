package lista2;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();

        if (numero % 2 == 0){
            numero = numero + 1;
            System.out.println(numero);
        } else {
            numero = numero - 1;
            System.out.println(numero);
        }
    }
}
