package Generics_e_Wildcard.atividade2;

public class Main {
    public static void main(String[] args) {

        Produto<String> produtoString = new Produto<>("14", 10.99, "01/12/2025",
                "01/12/2025");

        Produto<Integer> produtoInt = new Produto<>(12, 10.99, "01/12/2025",
                "01/12/2025");

        System.out.println(produtoString);
        System.out.println(produtoInt);

    }
}
