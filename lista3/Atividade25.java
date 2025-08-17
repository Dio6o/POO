package lista3;


public class Atividade25 {
    public static void main(String[] agrs){
        System.out.println("Lojas Quase Dois - Tabela de preços:");

        double valor;
        for(int i = 1; i <= 50; i++){
            valor = (double) i * 1.99;
            System.out.println(i + " - R$ " + valor);
        }
    }
}
