package lista4;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] data = new int[3];
        String[] dataSeparada;
        String dia;
        String mes;
        String ano;

        do{
            System.out.print("Digite uma data no padrao dd/mm/aaaa: ");
            dataSeparada = input.nextLine().split("/");

            if (dataSeparada.length == 3) {
                dia = dataSeparada[0];

                if(dia.length() == 2){
                    data[0] = Integer.parseInt(dataSeparada[0]);

                    if(data[0] == 0 || data[0] > 31){
                        System.out.println("Data invalida tente novamente. ");
                        continue;
                    }

                } else {
                    System.out.println("Data invalida tente novamente. ");
                    continue;
                }

                mes = dataSeparada[1];

                if(mes.length() == 2){
                    data[1] = Integer.parseInt(dataSeparada[1]);

                    if(data[1] == 0 || data[1] > 12){
                        System.out.println("Data invalida tente novamente. ");
                        continue;
                    }

                } else {
                    System.out.println("Data invalida tente novamente. ");
                    continue;

                }

                ano = dataSeparada[2];

                if(ano.length() == 4){
                    data[2] = Integer.parseInt(dataSeparada[2]);

                    if(data[2] == 0 || data[2] > 9999){
                        System.out.println("Data invalida tente novamente. ");
                        continue;
                    }

                } else {
                    System.out.println("Data invalida tente novamente. ");
                    continue;
                }


            } else {
                System.out.println("Data invalida tente novamente. ");
                continue;
            }
            break;

        } while(true);

        System.out.printf("Data separada: %d , %d, %d \n", data[0], data[1], data[2]);
    }
}
