package Lista9.SistemaAcademico;

public class Disciplina {

    private String nomeDisciplina;
    private int idDisciplina;
    protected Professor professor;
    protected Aluno aluno;
    protected SituacaoAluno situacaoAluno;

    Disciplina() {}

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public SituacaoAluno getSituacaoAluno() {
        return situacaoAluno;
    }

    public void setSituacaoAluno(SituacaoAluno situacaoAluno) {
        this.situacaoAluno = situacaoAluno;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Disciplina{");
        sb.append("nomeDisciplina='").append(nomeDisciplina).append('\'');
        sb.append(", idDisciplina=").append(idDisciplina);
        sb.append(", professor=").append(professor);
        sb.append(", aluno=").append(aluno);
        sb.append(", situacaoAluno=").append(situacaoAluno);
        sb.append('}');
        return sb.toString();
    }

}
