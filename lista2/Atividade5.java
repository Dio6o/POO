package lista2;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String letra = input.nextLine();

        switch (letra) {
            case "A", "E", "I", "O", "U":
                System.out.println("Vogal");
                break;
            default:
                System.out.println("Consoante");
        }
    }
}
