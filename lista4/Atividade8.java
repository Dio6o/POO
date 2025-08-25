package lista4;

import java.util.Scanner;

public class Atividade8 {
    public static <Stringbuilder> void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 0, 4, 8, 14, 20 position of vowels
        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        int size;
        do {
            System.out.print("Digite o tamanho da senha: ");
            size = input.nextInt();
            if (size > 26 || size <= 0){
               System.out.println("Senha fora do limite tente novamente.");
            }
        } while(size > 26 || size <= 0);
        char[] senha = new char[size];


        int randomNum;
        char letra;
        for(int i = 1; i <= senha.length; i++){
            if(i % 2 != 0){
                do{
                    randomNum = (int) (Math.random() * alfabeto.length);
                    letra = alfabeto[randomNum];
                    if(letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u'){
                        senha[i - 1] = letra;
                        break;
                    }
                } while(true);
            } else {
                do {
                    randomNum = (int) (Math.random() * alfabeto.length);
                    letra = alfabeto[randomNum];
                    if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                        senha[i - 1] = letra;
                        break;
                    }
                } while (true);
            }
        }

        System.out.print("Senha: ");
        for(int j = 0; j <= senha.length - 1; j++){
            System.out.print(senha[j]);;
        }
    }
}
