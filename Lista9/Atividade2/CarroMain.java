package Lista9.Atividade2;

public class CarroMain {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Motor motor = new Motor();

        Carro carro = new Carro("Volvo", "XC 60", "Prata", 2025, motor, pessoa);
        pessoa.setNome("Diogo");

        System.out.println(carro);
    }
}
