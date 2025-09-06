package lista6;

public class Atividade1 {

    private String nome = "";
    private String sobreNome = "";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String nomeCompleto(){
        return nome + " " + sobreNome;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Seu nome completo é: ").append(nomeCompleto());
        return sb.toString();
    }

}
