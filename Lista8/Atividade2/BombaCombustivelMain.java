package Lista8.Atividade2;

public class BombaCombustivelMain {
    public static void main(String[] args) {

        BombaDiesel bombaDiesel = new BombaDiesel(100.0, 6.1F);

        System.out.println(bombaDiesel.abastecerPorLitro(10));
        System.out.println(bombaDiesel.getTotalLitros());

        System.out.println(bombaDiesel.abastecerPorValor(61));
        System.out.println(bombaDiesel.getTotalLitros());

    }
}
