package lista6;

public class Atividade8Main {
    public static void main(String[] args) {

        Conta conta1 = new Conta(1, "Diogo", 100);

        System.out.println("Dados da conta inicial: ");
        System.out.println(conta1.toString() + "\n");

        conta1.sacar(101);
        conta1.depositar(0);

        conta1.sacar(25);
        conta1.depositar(10);
        conta1.alterarNome("Ze");
        System.out.println(conta1.toString() + "\n");



        Conta conta2 = new Conta(2, "Galo", 50);
        System.out.println(conta2.toString());

    }

}
