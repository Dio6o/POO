package lista4;

import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int SIZE = 10;
        int[] vet =  new int[SIZE];
        int i = 0;
        int valor = 0;

        do{
            System.out.print("Digite um valor: ");
            valor = input.nextInt();

            if(valor >= 0 && valor <= 20){
                vet[i] = valor;
                i++;
            } else {
                System.out.println("Valor invalido, tente novamente. ");
            }

        } while (i < SIZE);

        int num;
        for(int j = 0; j < SIZE; j++){
            num = vet[j];
            System.out.print(num + ": ");
            for(int k = 0; k < num; k++){
                System.out.print("#");
            }
            System.out.println();
        }

    }
}
