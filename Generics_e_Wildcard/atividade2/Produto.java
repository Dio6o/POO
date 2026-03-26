package Generics_e_Wildcard.atividade2;

public class Produto <T>{

    private T id;
    private double valor;
    private String dataFabricacao;
    private String dataVencimento;

    public Produto(T id, double valor, String dataFabricacao, String dataVencimento) {
        setId(id);
        setValor(valor);
        setDataFabricacao(dataFabricacao);
        setDataVencimento(dataVencimento);
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produto{");
        sb.append("id=").append(id);
        sb.append(", valor=").append(valor);
        sb.append(", dataFabricacao='").append(dataFabricacao).append('\'');
        sb.append(", dataVencimento='").append(dataVencimento).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
