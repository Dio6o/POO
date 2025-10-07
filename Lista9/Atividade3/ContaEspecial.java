package Lista9.Atividade3;

public class ContaEspecial extends ContaBancaria {

    private int diasSemJuros;
    private double limite;
    protected CartaoDeCredito cartao;

    public ContaEspecial() {}

    public int getDiasSemJuros() {
        return diasSemJuros;
    }

    public void setDiasSemJuros(int diasSemJuros) {
        this.diasSemJuros = diasSemJuros;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public CartaoDeCredito getCartao() {
        return cartao;
    }

    public void setCartao(CartaoDeCredito cartao) {
        this.cartao = cartao;
    }

    // Methods


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContaEspecial{");
        sb.append("diasSemJuros=").append(diasSemJuros);
        sb.append(", limite=").append(limite);
        sb.append(", cartao=").append(cartao);
        sb.append('}');
        return sb.toString();
    }
}
