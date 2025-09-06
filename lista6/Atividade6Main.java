package lista6;

public class Atividade6Main {
    public static void main(String[] args) {
        Atividade6 q = new Atividade6();

        q.setLado(5);
        System.out.println(q.area());

        q.mudarLado(10);
        System.out.println(q.area());
    }
}
