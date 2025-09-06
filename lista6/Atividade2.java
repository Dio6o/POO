package lista6;

public class Atividade2 {

    private int a = 0;
    private int b = 0;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        if (a > b){
            System.out.println("Valor de A maior que o valor de B, atualize o intervalo.");
        }
        this.b = b;
    }

    public StringBuilder intervalo(){
        StringBuilder valores = new StringBuilder();

        for (int i = a + 1; i < b; i++){
            valores.append(i).append(" ");
        }

        return valores;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(intervalo());
        return sb.toString();
    }

}
