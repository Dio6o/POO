package misc;

public class AtividadeDataMain {
    public static void main(String[] args) {

        AtividadeDatas data1 = new AtividadeDatas("2024-02-23", "2025-07-01", "SUNDAY");
        AtividadeDatas data2 = new AtividadeDatas("2021-02-23", "2022-01-01", "MONDAY");

        System.out.println("Data 1:");
        System.out.println(data1.contadorDia());

        System.out.println("Data 2:");
        System.out.println(data2.contadorDia());


    }
}
