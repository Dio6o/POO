package Lista8.Atividade2;

public class Bomba {

    private double totalLitros;
    private float valorLitro;

    Bomba() {
    }

    public double getTotalLitros() {
        return totalLitros;
    }

    public void setTotalLitros(double totalLitros) {
        this.totalLitros = totalLitros;
    }

    public float getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(float valorLitro) {
        this.valorLitro = valorLitro;
    }

    // Methods

    public double abastecerPorLitro(int litros) {
        setTotalLitros(getTotalLitros() - litros);
        return getValorLitro() * litros;
    }

    public double abastecerPorValor(double valor) {
        double quantidade = valor / getValorLitro();
        setTotalLitros(getTotalLitros() - quantidade);
        return quantidade;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bomba: ");
        sb.append("Total Litros: ").append(totalLitros).append("\n");
        sb.append("Valor Litro: ").append(valorLitro).append("\n");
        return sb.toString();
    }
}
