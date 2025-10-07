package Lista9.SistemaAcademico;

public class Fase {

    private int numeroFase;
    protected Disciplina disciplina;

    Fase() {}

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public int getNumeroFase() {
        return numeroFase;
    }

    public void setNumeroFase(int numeroFase) {
        this.numeroFase = numeroFase;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fase{");
        sb.append("numeroFase=").append(numeroFase);
        sb.append(", disciplina=").append(disciplina);
        sb.append('}');
        return sb.toString();
    }

}
