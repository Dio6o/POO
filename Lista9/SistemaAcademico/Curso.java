package Lista9.SistemaAcademico;

public class Curso {

    private String nome;
    private int idCurso;
    protected Fase fase;
    protected Disciplina disciplinasOfertadas;

    Curso(String nome, int idCurso, Fase fase) {
        setNome(nome);
        setIdCurso(idCurso);
        setFase(fase);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public Fase getFase() {
        return fase;
    }

    public void setFase(Fase fase) {
        this.fase = fase;
    }

    public Disciplina getDisciplinasOfertadas() {
        return disciplinasOfertadas;
    }

    public void setDisciplinasOfertadas(Disciplina disciplinasOfertadas) {
        this.disciplinasOfertadas = disciplinasOfertadas;
    }

    // Methods


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Curso{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", idCurso=").append(idCurso);
        sb.append(", fase=").append(fase);
        sb.append(", disciplinasOfertadas=").append(disciplinasOfertadas);
        sb.append('}');
        return sb.toString();
    }

}
