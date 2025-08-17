package lista3;

public class Atividade26 {
    public static void main(String[] agrs){
        System.out.println("""
                Preço do pão: R$ 0.18,
                Panificadora Pão de Ontem - Tabela de preços:""");

        double valor;
        for(int i = 1; i <= 50; i++){
            valor = (double) i * 0.18;
            System.out.printf("%d - R$ %.2f\n", i, valor);
        }
    }
}
