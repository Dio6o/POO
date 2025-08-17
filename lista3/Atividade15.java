package lista3;

public class Atividade15 {
    public static void main(String[] args) {

        int x = 38;
        double y = 1;
        double operacao;
        double total = 0;

        for (int i = 1; i <= 37; i++){
            operacao = (x * (x - 1))/y;
            total += operacao;
            x--;
            y++;

        }

        System.out.println(total);
    }
}
