package Lista9.Atividade4;

public class ComputadorMain {
    public static void main(String[] args) {

        Processador processador = new Processador();
        Hd hd = new Hd();
        Memoria memoria = new Memoria();
        PlacaMae placaMae = new PlacaMae("Asus", "Gamer", processador,  hd, memoria);
        Gabinete gabinete = new Gabinete("Top", "Aquario", 5, placaMae);
        Teclado teclado = new Teclado();
        Mouse mouse = new Mouse();
        Monitor monitor = new Monitor();
        Computador computador = new Computador("Positivo", "O melhor que tem", gabinete, teclado, mouse, monitor);

        System.out.println("Computador: " + computador);
    }
}
