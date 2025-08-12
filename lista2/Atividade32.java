package lista2;

import java.util.Scanner;

public class Atividade32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contador = 0;

        String tiposCarne = "";

        System.out.print("Quantos Kg de File Duplo? ");
        double quantidadeFileDuplo = input.nextDouble();
        double precoFile = 0;
        if (quantidadeFileDuplo > 0) {
            contador++;
            if (quantidadeFileDuplo < 5) {
                precoFile = 4.9;
            } else {
                precoFile = 5.8;
            }

            tiposCarne = "File Duplo";
        }

        System.out.print("Quantos Kg de Alcatra? ");
        double quantidadeAlcatra = input.nextDouble();
        double precoAlcatra = 0;
        if (quantidadeAlcatra > 0) {
            contador++;
            if (quantidadeAlcatra < 5) {
                precoAlcatra = 5.9;
            } else {
                precoAlcatra = 6.8;
            }
            tiposCarne = tiposCarne + " Alcatra";
        }

        double quantidadePicanha = 0;
        double precoPicanha = 0;

        if (contador < 2){
            System.out.print("Quantos Kg de Picanha? ");
            quantidadePicanha = input.nextDouble();
            if (quantidadePicanha < 5) {
                precoAlcatra = 6.9;
            } else {
                precoAlcatra = 7.8;
            }

            tiposCarne = tiposCarne + " Picanha";
        }

        double quantidadeCarne = quantidadeAlcatra + quantidadePicanha + quantidadeFileDuplo;
        double total = (quantidadeFileDuplo * precoFile) + (quantidadeAlcatra * precoAlcatra) +
                (quantidadePicanha * precoPicanha);

        System.out.print("Forma de pagamento? ");
        String formaPagamento = input.next().toLowerCase();
        double desconto = 0;
        if (formaPagamento.equalsIgnoreCase("carto Tabajara")) {
            desconto = total * 0.05;
        }

        double valorPagar = total - desconto;

        System.out.printf("""
                Tipos de carne: %s,
                Quantidade de carne: %.2f,
                Preço total: %.2f,
                Tipo pagamento: %s,
                Valor desconto: %.2f,
                Valor a pagar: %.2f,
                """, tiposCarne, quantidadeCarne, total, formaPagamento, desconto, valorPagar);

    }
}
