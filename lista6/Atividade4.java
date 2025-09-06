package lista6;

public class Atividade4 {

    private double valorHora = 0;
    private double quantiadeHoras = 0;

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getQuantiadeHoras() {
        return quantiadeHoras;
    }

    public void setQuantiadeHoras(double quantiadeHoras) {
        this.quantiadeHoras = quantiadeHoras;
    }

    public double salarioBruto() {
        return valorHora * quantiadeHoras;
    }

    public double impostoRenda() {
        return salarioBruto() * 0.11;
    }

    public double inss() {
        return salarioBruto() * 0.08;
    }

    public double sindicato() {
        return salarioBruto() * 0.05;
    }

    public double descontos() {
        return impostoRenda() + inss() + sindicato();
    }

    public double salarioLiquido() {
        return salarioBruto() - descontos();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Salário bruto: R$ ").append(salarioBruto()).append("\n");
        sb.append("IR (11%): R$ ").append(impostoRenda()).append("\n");
        sb.append("INSS (8%): R$ ").append(inss()).append("\n");
        sb.append("Sindicato (5%): R$ ").append(sindicato()).append("\n");
        sb.append("Salário líquido: R$ ").append(salarioLiquido()).append("\n");
        return sb.toString();

    }

}
