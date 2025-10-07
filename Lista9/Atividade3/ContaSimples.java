package Lista9.Atividade3;

public class ContaSimples extends ContaBancaria{

    private double saldoPoupanca;

    ContaSimples() {}

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

    // Methods

    public boolean depositoPoupanca(double valor){
        if (valor > 0){
            setSaldoPoupanca(getSaldoPoupanca() + valor);
            return true;
        } else {
            return false;
        }

    }

    public boolean saquePoupanca(double valor){
        if (valor > 0){
            setSaldoPoupanca(getSaldoPoupanca() - valor);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContaSimples{");
        sb.append("saldoPoupanca=").append(saldoPoupanca);
        sb.append('}');
        return sb.toString();
    }

}
