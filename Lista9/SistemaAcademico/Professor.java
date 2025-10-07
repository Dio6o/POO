package Lista9.SistemaAcademico;

public class Professor {

    private String nome;
    private int idProfessor;

    Professor() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Professor{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", idProfessor=").append(idProfessor);
        sb.append('}');
        return sb.toString();
    }

}
