package misc;

public class Quadrado {

    private int lado;

    public Quadrado(int lado) {
        setLado(lado);
    }

    public void mudarLado(int lado){
        setLado(lado);
    }

    public int area(){
        return getLado() * getLado();
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Quadrado{");
        sb.append("lado = ").append(lado);
        sb.append(", area = ").append(area());
        sb.append('}');
        return sb.toString();
    }
}
