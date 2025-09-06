package lista6;
import java.util.Scanner;

public class Atividade1Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Atividade1 n = new Atividade1();

        System.out.print("Informe seu nome: ");
        n.setNome(input.nextLine());

        System.out.print("Informe seu sobrenome: ");
        n.setSobreNome(input.nextLine());

        System.out.println(n.toString());
        
    }
}
