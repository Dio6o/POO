package misc;

public class Familia {

    private String nome;

    private static String sobrenome;

    public static String setSobreNome(){
        return  sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void setSobrenome(String sobrenome) {
        Familia.sobrenome = sobrenome;
    }
}
