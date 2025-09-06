package lista6;

public class Atividade6 {

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public void mudarLado(int valor){
        this.lado = valor;
    }

    public int valorLado(){
        return this.lado;
    }

    public int area(){
        return this.lado * this.lado;
    }

}
