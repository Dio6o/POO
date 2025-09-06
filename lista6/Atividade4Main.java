package lista6;
import java.util.Scanner;

public class Atividade4Main {
    public static void main(String[] args) {
        Atividade4 folha = new Atividade4();
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor da hora trabalhada: ");
        folha.setValorHora(input.nextDouble());

        System.out.print("Informe a quantidade de horas trabalhadas: ");
        folha.setQuantiadeHoras(input.nextDouble());

        System.out.println(folha.toString());

    }
}
