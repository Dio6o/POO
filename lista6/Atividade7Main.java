package lista6;

public class Atividade7Main {
    public static void main(String[] args) {
        Atividade7 pessoa = new Atividade7();

        pessoa.setNome("Diogo");
        pessoa.setPeso(65);
        pessoa.setAltura(1.6);
        pessoa.setIdade(18);
        System.out.println("Dados no inicio: ");
        System.out.println(pessoa.toString() + "\n");

        //Metodo envelhecer
        pessoa.envelhecer(5);
        System.out.println(pessoa.toString() + "\n");


        //Metodo engordar
        pessoa.engordar(15);
        System.out.println(pessoa.toString() + "\n");


        //metodo emagrecer
        pessoa.emagrecer(5);
        System.out.println(pessoa.toString() + "\n");

        //metodo crescer
        pessoa.crescer(0.4);
        System.out.println(pessoa.toString() + "\n");

    }
}
