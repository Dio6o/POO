package lista6;

public class Atividade9Main {
    public static void main(String[] args) {
        Atividade9 tv = new Atividade9();

        tv.atualizaVolume(30);
        System.out.println(tv.getVolume());
        tv.atualizaVolume(35);
        System.out.println(tv.getVolume());


        tv.atualizaCanal(50);
        System.out.println(tv.getCanal());
        tv.atualizaCanal(70);
        System.out.println(tv.getCanal());
    }
}
