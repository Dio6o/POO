package Lista9.SistemaAcademico;

public class SituacaoAluno {

    protected DadosDisciplina dadosDisciplina;

    SituacaoAluno(DadosDisciplina dadosDisciplina){
        setDadosDisciplina(dadosDisciplina);
    }

    public DadosDisciplina getDadosDisciplina() {
        return dadosDisciplina;
    }

    public void setDadosDisciplina(DadosDisciplina dadosDisciplina) {
        this.dadosDisciplina = dadosDisciplina;
    }

    // Methods

    public String verificarSituacao() {
        if (getDadosDisciplina().verificarMedia() >= 6){
            if (getDadosDisciplina().verificarFrequencia() >= 75){
                return "Aprovado";
            } else {
                return "Reprovado por falta";
            }
        } else {
            return "Reprovado";
        }
    }
}
