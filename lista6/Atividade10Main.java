package lista6;

public class Atividade10Main {
    public static void main(String[] args) {
        Posto posto = new Posto("Gasolina", 100, 6.5);

        //Abastecendo por litro
        System.out.println(posto.abastecerPorLitro(10));

        //Abastecendo por valor
        System.out.println(posto.abastecerPorValor(100));

        System.out.println(posto.toString());

        //Alterando combustivel, valor por litro e quantidade.
        posto.alterarCombustivel("Diesel");
        posto.alterarValor(5.9);
        posto.alterarQuantidadeCombustivel(100);
        System.out.println(posto.toString());

        System.out.println(posto.abastecerPorValor(100));
        System.out.println(posto.getQuantidadeCombustivel());
    }
}
