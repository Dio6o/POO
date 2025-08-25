package lista4;

import java.util.Scanner;
public class Atividade12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int SIZE = 5;

        int[] idades = new int[SIZE];
        double[] altura = new double[SIZE];

        double mediaIdade = 0;
        double mediaAltura = 0;
        int maisVelho = 0;
        int maisNovo = 0;
        double maisAlto = 0;
        double maisBaixo = 0;


        for(int i = 0; i < SIZE; i++){
            System.out.print("Informe a idade da pessoa " + (i+1) + ": ");
            idades[i] = input.nextInt();

            System.out.print("Informe a altura da pessoa " + (i+1) + ": ");
            altura[i] = input.nextDouble();

            mediaAltura += altura[i];
            mediaIdade += idades[i];
        }

        mediaAltura /= SIZE;
        mediaIdade /= SIZE;

        for(int i = 0; i < SIZE; i++){
            if(i == 0){
                maisVelho = idades[0];
                maisNovo = idades[0];
                maisAlto = altura[0];
                maisBaixo = altura[0];
            }

            if(altura[i] > maisAlto){
                maisAlto = altura[i];
            }

            if(altura[i] < maisBaixo){
                maisBaixo = altura[i];
            }

            if(idades[i] > maisVelho){
                maisVelho = idades[i];
            }

            if(idades[i] < maisNovo){
                maisNovo = idades[i];
            }
        }

        System.out.println("Idades e alturas na ordem inversa: ");
        for(int i = SIZE - 1; i >= 0; i--){
            System.out.println("Idade: " + idades[i]);
            System.out.println("Altura: " + altura[i]);
        }

        System.out.printf("""
                Altura do mais alto: %.2f,
                Altura do mais baixo: %.2f,
                Idade do mais velho: %d,
                Idade do mais novo: %d,
                Altura media: %.2f,
                Idade media: %.2f.\n""", maisAlto, maisBaixo, maisVelho, maisNovo, mediaAltura, mediaIdade);

        for(int j = 0; j < SIZE; j++){
            if(idades[j] > mediaIdade){
                System.out.println(idades[j] + ", idade acima da media.");
            } else if(idades[j] < mediaIdade){
                System.out.println(idades[j] + ", idade abaixo da media.");
            }

            if(altura[j] > mediaAltura){
                System.out.println(altura[j] + ", altura acima da media.");
            } else if(altura[j] < mediaAltura){
                System.out.println(altura[j] + ", altura abaixo da media.");
            }
        }






    }
}
