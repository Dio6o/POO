package lista6;

public class Atividade3 {

    private double a = 0;
    private double b = 0;

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double soma(){
        return a+b;
    }

    public double subtracao(){
        return a-b;
    }

    public double multiplicacao(){
        return a*b;
    }

    public double divisao(){
        return a/b;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Soma: ").append(soma()).append("\n");
        sb.append("Subtração: ").append(subtracao()).append("\n");
        sb.append("Multiplicação: ").append(multiplicacao()).append("\n");
        sb.append("Divisão: ").append(divisao()).append("\n");
        return sb.toString();

    }
}
