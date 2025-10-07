package Lista8.Atividade1;

public class PessoaFisica extends Pessoa{

    private String cpf;
    private String estadoCivil;

    PessoaFisica(){
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    // methods


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PessoaFisica{");
        sb.append("cpf='").append(cpf).append('\'');
        sb.append(", estadoCivil='").append(estadoCivil).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
