package lista3;
import java.util.Scanner;

public class Atividade28 {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);

        double temperatura = 0;
        int contador = 0;
        double soma = 0;
        double maior = -100;
        double menor = 1000;

        do {
            System.out.print("Informe a temperatura: ");
            temperatura = input.nextDouble();
            if (temperatura == 100) {
                break;
            }

            if  (temperatura < menor) {
                menor = temperatura;
            }
            if  (temperatura > maior) {
                maior = temperatura;
            }

            contador++;
            soma += temperatura;

        } while(true);

        double media = soma/contador;

        System.out.printf("""
                A média das temperaturas foi de: %.2fºc,
                a menor temperatura foi de: %.2fºc,
                a maior temperatura foi de: %.2fºc.
                """, media, menor, maior);

    }
}
