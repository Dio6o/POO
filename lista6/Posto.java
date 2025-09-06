//Metodo utilizado na atividade 10
package lista6;

public class Posto {

    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(double valorLitro) {
        this.valorLitro = valorLitro;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void setQuantidadeCombustivel(double quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public Posto(String tipoCombustivel, double quantidadeCombustivel, double valorLitro) {
        this.tipoCombustivel = tipoCombustivel;
        this.quantidadeCombustivel = quantidadeCombustivel;
        this.valorLitro = valorLitro;
    }

    public double abastecerPorValor(double valor) {
        double resultado = valor / getValorLitro();

        if (resultado > getQuantidadeCombustivel()) {
            return 0;
        } else {
            setQuantidadeCombustivel(getQuantidadeCombustivel() - resultado);
            return resultado;
        }

    }

    public double abastecerPorLitro(double litros) {
        double resultado = litros * getValorLitro();

        if (litros > getQuantidadeCombustivel()) {
            return 0;
        } else {
            setQuantidadeCombustivel(getQuantidadeCombustivel() - litros);
            return resultado;
        }

    }

    public void alterarValor(double valor) {
        setValorLitro(valor);
    }

    public void alterarQuantidadeCombustivel(double quantidade) {
        setQuantidadeCombustivel(quantidade + getQuantidadeCombustivel());
    }

    public void alterarCombustivel(String combustivel) {
        setTipoCombustivel(combustivel);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Posto: ");
        sb.append("tipoCombustivel: '").append(tipoCombustivel).append('\'');
        sb.append(", valorLitro: R$ ").append(valorLitro);
        sb.append(", quantidadeCombustivel: ").append(quantidadeCombustivel);
        return sb.toString();
    }
}
