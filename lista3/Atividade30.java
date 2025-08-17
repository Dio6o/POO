package lista3;

import java.util.Scanner;

public class Atividade30 {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);

        double maisGordo = 1;
        int codigoMaisGordo = 0;

        double maisMagro = 1000;
        int codigoMaisMagro = 0;

        double maisAlto = 0;
        int codigoMaisAlto = 0;

        double maisBaixo = 1000;
        int codigoMaisBaixo = 0;

        double totalAltura = 0;
        double totalPeso = 0;
        int totalClientes = 0;
        int codigo = 0;
        double peso;
        double altura;

        System.out.println("Senso da academia! \n Digite '0' para finaliar.");

        do {
            System.out.print("Informe seu código: ");
            codigo = input.nextInt();

            if (codigo == 0){
                System.out.println("Senso finaliado!");
                break;
            }

            System.out.print("Informe seu peso: ");
            peso = input.nextDouble();

            if (peso > maisGordo){
                maisGordo = peso;
                codigoMaisGordo = codigo;
            } else if (peso < maisMagro){
                maisMagro = peso;
                codigoMaisMagro = codigo;
            }

            System.out.print("Informe sua altura: ");
            altura = input.nextDouble();

            if (altura > maisAlto){
                maisAlto = altura;
                codigoMaisAlto = codigo;
            } else if (altura < maisBaixo){
                maisBaixo = altura;
                codigoMaisBaixo = codigo;
            }

            totalClientes ++;
            totalPeso += peso;
            totalAltura += altura;

            System.out.println("Próximo entrevistado.\n");

        } while (true);

        double mediaAltura =  totalAltura / totalClientes;
        double mediaPeso = totalPeso / totalClientes;

        System.out.printf("""
                Código do cliente mais gordo: %d, peso do cliente mais gordo: %.2f kgs,
                Código do cliente mais magro: %d, peso do cliente mais magro: %.2f kgs,
                Código do cliente mais alto: %d, altura do cliente mais alto: %.2f m,
                Código do cliente mais alto: %d, altura do cliente mais baixo: %.2f m,
                média de peso dos clientes: %.2f kgs,
                média de altura dos clientes: %.2f m.
                """, codigoMaisGordo, maisGordo, codigoMaisMagro, maisMagro, codigoMaisAlto, maisAlto, codigoMaisBaixo,
                maisBaixo, mediaPeso, mediaAltura);
    }
}
