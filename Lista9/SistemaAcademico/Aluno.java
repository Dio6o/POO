package Lista9.SistemaAcademico;

public class Aluno {

    private String nome;
    private int matricula;
    protected Curso curso;

    Aluno(String nome, int matricula, Curso curso) {
        setNome(nome);
        setMatricula(matricula);
        setCurso(curso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    // Methods

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Aluno{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", matricula='").append(matricula).append('\'');
        sb.append(", curso=").append(curso);
        sb.append('}');
        return sb.toString();
    }

}
