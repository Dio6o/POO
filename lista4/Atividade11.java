package lista4;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite palavras separadas com ';': ");
        String texto = input.nextLine();

        String[] palavras = new String[texto.length()];
        StringBuilder palavra = new StringBuilder(new StringBuilder());
        int posicao = 0;

        for(int i = 0; i < texto.length(); i++){

            if(texto.charAt(i) == ';'){
                palavras[posicao] = palavra.toString();
                posicao++;
                palavra = new StringBuilder();
            } else {
                palavra.append(texto.charAt(i));
            }
        }

        for(int i = 0; i < palavras.length; i++){
            if(palavras[i] != null){
                System.out.println(palavras[i]);
            }
        }


    }
}
