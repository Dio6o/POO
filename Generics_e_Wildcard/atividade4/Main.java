package Generics_e_Wildcard.atividade4;

public class Main {
    public static void main(String[] args) {

        ListaLinear lista = new ListaLinear();

        System.out.println(lista.inserirValor("1", 12));
        System.out.println(lista.inserirValor("2", true));
        System.out.println(lista.inserirValor("3", "a"));
        System.out.println(lista.inserirValor("4", "bla bla bla"));
        System.out.println(lista.inserirValor("5", 1.243));

        System.out.println("Mostar Lista: ");
        lista.mostrarLista();

        System.out.println(lista.inserirValor("4", 123));
        System.out.println(lista.inserirValor("7", "123"));

        lista.mostrarLista();
        System.out.println();

        lista.buscarChave("2");

        lista.buscarChave("10");



    }
}
