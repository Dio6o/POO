package lista4;

import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = input.nextLine();
        char[] textoSeparado = new char[texto.length()];

        for(int i = 0; i < texto.length(); i++){
            textoSeparado[i] = texto.charAt(i);
        }

        System.out.println("Texto separado: ");
        for(int i = 0; i < textoSeparado.length; i++){
            System.out.print(textoSeparado[i] + " ");
        }
    }
}
