package misc;

public class Intervalo {

    private int numA;
    private int numB;

    public Intervalo(int numA, int numB) {
        setNumA(numA);
        setNumB(numB);
    }

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        if (numB > numA) {
            this.numB = numB;
        } else {
            System.out.println("Erro: numA > numB.");
        }
    }

    public StringBuilder valores() {
        StringBuilder s = new StringBuilder();
        for (int i = getNumA(); i < getNumB(); i++) {
            s.append(i).append(" ");
        }

        return s;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Intervalo{");
        sb.append("numA= ").append(numA);
        sb.append(", numB= ").append(numB);
        sb.append(", valores= ").append(valores());
        sb.append('}');
        return sb.toString();
    }
}
