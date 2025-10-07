package Lista9.Atividade3;

public class ContaBancaria {

    protected Banco banco;
    private int agencia;
    private int NumeroDaConta;
    private double saldo;

    protected Pessoa correntista;

    public ContaBancaria() {}

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroDaConta() {
        return NumeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        NumeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Pessoa getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Pessoa correntista) {
        this.correntista = correntista;
    }

    // Methods

    public boolean deposito(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            return true;
        } else {
            return false;
        }
    }

    public boolean saque(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() - valor);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContaBancaria{");
        sb.append("banco=").append(banco);
        sb.append(", agencia=").append(agencia);
        sb.append(", NumeroDaConta=").append(NumeroDaConta);
        sb.append(", saldo=").append(saldo);
        sb.append(", correntista=").append(correntista);
        sb.append('}');
        return sb.toString();
    }

}
