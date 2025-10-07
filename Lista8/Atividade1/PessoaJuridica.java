package Lista8.Atividade1;

public class PessoaJuridica extends Pessoa{

    private String cnpj;
    private String tipoEmpresa;

    PessoaJuridica(){
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    //Methods

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PessoaJuridica{");
        sb.append("cnpj='").append(cnpj).append('\'');
        sb.append(", tipoEmpresa='").append(tipoEmpresa).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
