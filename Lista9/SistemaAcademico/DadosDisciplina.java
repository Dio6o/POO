package Lista9.SistemaAcademico;

public class DadosDisciplina {

    private int aulas;
    private int faltas;
    private double notas;
    private int quantidadeProvas;
    protected Aluno aluno;
    protected Professor professor;

    DadosDisciplina(int aulas, int faltas, double notas, int quantidadeProvas, Aluno aluno, Professor professor) {
        setAulas(aulas);
        setFaltas(faltas);
        setNotas(notas);
        setQuantidadeProvas(quantidadeProvas);
        setAluno(aluno);
        setProfessor(professor);
    }

    public int getQuantidadeProvas() {
        return quantidadeProvas;
    }

    public void setQuantidadeProvas(int quantidadeProvas) {
        this.quantidadeProvas = quantidadeProvas;
    }

    public int getAulas() {
        return aulas;
    }

    public void setAulas(int aulas) {
        this.aulas = aulas;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    // Methods

    public double verificarFrequencia(){
        return (double) (getFaltas() * 100) / getAulas();
    }

    public double verificarMedia(){
        return getNotas() / getQuantidadeProvas();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SituacaoAluno{");
        sb.append("aulas=").append(aulas);
        sb.append(", faltas=").append(faltas);
        sb.append(", notas=").append(notas);
        sb.append(", quantidadeProvas=").append(quantidadeProvas);
        sb.append(", aluno=").append(aluno);
        sb.append(", professor=").append(professor);
        sb.append('}');
        return sb.toString();
    }

}
