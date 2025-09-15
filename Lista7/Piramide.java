package Lista7;

public class Piramide {

    private double h;
    private double ab;
    private int tipo;
    private final double RENDIMENTO = 4.76;
    private final int TAMANHOLATA = 18;

    public double getH() {
        return h;
    }

    public void setH(double h) {
        if (h > 0){
            this.h = h;
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public double getAb() {
        return ab;
    }

    public void setAb(double ab) {
        if (ab > 0){
            this.ab = ab;
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        if (tipo > 0){
            this.tipo = tipo;
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public Piramide(double h, double ab, int tipo) {
        setH(h);
        setAb(ab);
        setTipo(tipo);
    }

    //Methods

    // Calculos da area da piramide

    public double al(){
        //Altura lateral
        return Math.sqrt(getH() * getH() + getAb() * getAb());
    }

    public double base(){
        return getAb() * 2;
    }

    public double areaBase(){
        return base() * base();
    }

    public double areaTriangulo(){
        return (base() * al()) / 2;
    }

    public double areaPiramide(){
        return (areaTriangulo() * 4) + areaBase();
    }

    public double volume(){
        return  (base() * base() * getH()) / 3;
    };

    //Calculos da pintura

    public double totalLitros(){
        return areaPiramide() / RENDIMENTO;
    }

    public double totalLatas(){
        return Math.ceil(totalLitros() / TAMANHOLATA);
    }

    public double tipoTinta(){
            double valor = 0;
            if (getTipo() == 1){
                valor = 127.9;
            }  else if (getTipo() == 2){
                valor = 258.98;
            } else if (getTipo() == 3){
                valor = 344.34;
            } else {
                System.out.println("Tipo invalido.");
            }

            return valor;
    }

    public double valorTotal(){
        return totalLatas() * tipoTinta();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ab: ").append(getAb()).append("\n");
        sb.append("h: ").append(getH()).append("\n");
        sb.append("aL: ").append(al()).append("\n");
        sb.append("____________________").append("\n");
        sb.append("Área Triângulo: ").append(areaTriangulo()).append("\n");
        sb.append("Área Base: ").append(areaBase()).append("\n");
        sb.append("Área Total: ").append(areaPiramide()).append("\n");
        sb.append("____________________").append("\n");
        sb.append("Tipo Tinta: ").append(getTipo()).append("\n");
        sb.append("Total de Litros de Tinta: ").append(totalLitros()).append("\n");
        sb.append("Total de Latas de Tinta: ").append(totalLatas()).append("\n");
        sb.append("Valor Total: R$ ").append(valorTotal()).append("\n");
        sb.append("Volume: ").append(volume()).append("\n");
        return sb.toString();
    }
}
