package lista2;

import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o preço do produto: ");
        double preco = input.nextDouble();

        System.out.print("Informe o código de origem: ");
        int codigoOrigem = input.nextInt();

        String localOrigem;

        switch(codigoOrigem){
            case 1:
                localOrigem = "Sul";
                break;
            case 2:
                localOrigem = "Norte";
                break;
            case 3:
                localOrigem = "Leste";
                break;
            case 4:
                localOrigem = "Oeste";
                break;
            case 5, 6:
                localOrigem = "Nordeste";
                break;
            case 7, 8:
                localOrigem = "Centro-Oeste";
                break;
            default:
                localOrigem = "Importado";
                break;
        }

        System.out.printf("Preço de custo: R$ %.2f, local de origem: %s\n", preco, localOrigem);

    }
}
