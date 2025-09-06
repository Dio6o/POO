//Metodo usado na atividade 8.

package lista6;

public class Conta {

    private int numeroConta = 0;
    private String titular = "";
    private double saldo = 0;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Constructor para criacao de outras contas
    public Conta(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double deposito) {
        if (deposito > 0) {
            this.saldo += deposito;
        } else {
            System.out.println("Valor invalido para deposito");
        }
    }

    public void sacar(double saque) {
        if (this.saldo > saque && (this.saldo - saque) > 0) {
            this.saldo -= saque;
        } else  {
            System.out.println("Saldo insuficiente");
        }
    }

    public void alterarNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.titular = nome;
        } else {
            System.out.println("Nome invalido para alterar");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Numero da conta = ").append(numeroConta);
        sb.append(", titular = '").append(titular).append('\'');
        sb.append(", saldo = R$ ").append(saldo);
        return sb.toString();
    }

}
