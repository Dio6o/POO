package Lista9.Atividade3;

public class CartaoDeCredito {

    private int numero;
    private String operacao;
    private double limite;
    private String tipoCarato;

    public CartaoDeCredito() {}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getTipoCarato() {
        return tipoCarato;
    }

    public void setTipoCarato(String tipoCarato) {
        this.tipoCarato = tipoCarato;
    }

}
