package lista3;

import java.util.Scanner;

public class Atividade34 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int valor = 0;
        int primeiroIntervalo = 0;
        int segundoIntervalo = 0;
        int terceiroIntervalo = 0;
        int quartoIntervalo = 0;

        do{
            System.out.print("Digite um valor: ");
            valor = input.nextInt();

            if (valor < 0){
                System.out.println("Valor negativo, programa finalizado.");
                break;
            }

            if (valor <= 25){
                primeiroIntervalo++;
            } else if (valor <= 50){
                segundoIntervalo++;
            } else if (valor <= 75){
                terceiroIntervalo++;
            } else if (valor <= 100){
                quartoIntervalo++;
            }

        } while(true);


        System.out.printf("""
                Valores no primeiro intervalo %d,
                Valores no segundo intervalo %d,
                Valores no terceiro intervalo %d,
                Valores no quarto intervalo %d.""",
                primeiroIntervalo, segundoIntervalo, terceiroIntervalo, quartoIntervalo);
    }
}
