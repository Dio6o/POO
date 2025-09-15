package misc;

public class Nome {

    private String nome;
    private String sobreNome;


    public Nome(String nome, String sobreNome){
        setNome(nome);
        setSobreNome(sobreNome);
    }

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
        return getNome() + " " + getSobreNome();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Nome{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", sobreNome='").append(sobreNome).append('\'');
        sb.append(", Nome completo=").append(nomeCompleto());
        sb.append('}');
        return sb.toString();
    }
}
