package lista2;

import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masculino ou feminino?, digite M ou F: ");
        String sexo = input.next();

        System.out.print("Informe a sua altura em metros: ");
        float altura = input.nextFloat();

        System.out.print("Informe seu peso em kilos: ");
        float peso = input.nextFloat();

        double pesoIdeal = 0;

        if (sexo.equals("M")){
            pesoIdeal = (72.7 * altura) - 58;
            sexo = "Masculino";
        } else if (sexo.equals("F")) {
            pesoIdeal = (62.1 * altura) - 44.7;
            sexo = "Feminino";
        }

        System.out.printf("Altura: %.1f, peso: %.0f, sexo: %s\n", altura, peso, sexo);
        System.out.printf("Peso ideal: %.1f\n", pesoIdeal);

        if (peso > pesoIdeal){
            System.out.println("Acima do peso.");
        } else if (peso < pesoIdeal){
            System.out.println("Abaixo do peso.");
        } else {
            System.out.println("Peso ideal.");
        }
    }
}
