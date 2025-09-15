package misc;

public class Triangulo {

    private int ladoA = 2;
    private int ladoB = 4;
    private String cor = "";


    public Triangulo(String cor, int ladoA, int ladoB) {
        setCor(cor);
        setLadoA(ladoA);
        setLadoB(ladoB);
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        if (ladoA > 1)
            this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        if (ladoB > 1)
            this.ladoB = ladoB;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor.length() > 3)
            this.cor = cor;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Triangulo{");
        sb.append("ladoA=").append(ladoA);
        sb.append(", ladoB=").append(ladoB);
        sb.append(", cor='").append(cor).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
