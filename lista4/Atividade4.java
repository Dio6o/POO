package lista4;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] letras = new String[10];
        int consoantes = 0;

        for(int i = 0; i < 10; i++){
            System.out.print("Digite uma letra: ");
            letras[i] = input.nextLine();
        }

        System.out.println("Consoantes: ");
        for(int i = 0; i < 10; i++){
            if (letras[i].equalsIgnoreCase("A") || letras[i].equalsIgnoreCase("E") ||
                    letras[i].equalsIgnoreCase("I") || letras[i].equalsIgnoreCase("O") ||
                    letras[i].equalsIgnoreCase("U")){
                consoantes++;
                System.out.println(letras[i] + " ");
            }
        }

        System.out.print("Total de consoantes: " + consoantes);

    }

}
