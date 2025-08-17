package lista3;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu usuário: ");
        String usuario = input.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = input.nextLine();

        while(senha.equals(usuario)){
            System.out.println("Erro, usuário e senha iguais...");

            System.out.print("Digite seu usuário: ");
            usuario = input.nextLine();

            System.out.print("Digite sua senha: ");
            senha = input.nextLine();

        }
    }
}
