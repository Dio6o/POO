package misc;

public class QuadradoMain {
    public static void main(String[] args) {

        Quadrado q = new Quadrado(4);

        System.out.println(q);

        q.mudarLado(6);
        System.out.println(q);
    }
}
