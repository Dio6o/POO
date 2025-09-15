package Lista7;

public class Cubo {

    private double lado;
    private double rendimento;
    private int tipo;
    private final double TAMANHOLATA = 18;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado > 0) {
            this.lado = lado;
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        if (rendimento > 0) {
            this.rendimento = rendimento;
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        if (tipo > 0) {
            this.tipo = tipo;
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public Cubo(double lado, double rendimento, int tipo) {
        setLado(lado);
        setRendimento(rendimento);
        setTipo(tipo);
    }

    //methods

    public double areaBase() {
        return getLado() * getLado();
    }

    public double areaCubo() {
        return areaBase() * 6;
    }

    public double volumeCubo(){
        return getLado() * getLado() * getLado();
    }

    public double diagonalCubo(){
        return getLado() * Math.sqrt(3);
    }

    public double litrosTinta(){
        return areaCubo() / getRendimento();
    }

    public double quantidadeLatas(){
        return Math.ceil(litrosTinta() / TAMANHOLATA);
    }

    public double tipoTinta(){
        double valor = 0;
        if (getTipo() == 1){
            valor = 101.9;
        }  else if (getTipo() == 2){
            valor = 212.45;
        } else if (getTipo() == 3){
            valor = 345.56;
        } else {
            System.out.println("Tipo invalido.");
        }

        return valor;
    }

    public double valorTotal(){
        return tipoTinta() * quantidadeLatas();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Lado: ").append(lado).append(" \n");
        sb.append("Rendimento: ").append(rendimento).append(" \n");
        sb.append("Tipo de Tinta: ").append(tipo).append(" \n");
        sb.append("________________________\n");
        sb.append("Área da Base: ").append(areaBase()).append(" \n");
        sb.append("Área Total: ").append(areaCubo()).append(" \n");
        sb.append("Volume: ").append(volumeCubo()).append(" \n");
        sb.append("Diagonal do Cubo: ").append(diagonalCubo()).append(" \n");
        sb.append("Litros Tinta: ").append(litrosTinta()).append(" \n");
        sb.append("Latas de Tinta: ").append(quantidadeLatas()).append(" \n");
        sb.append("Valor Total: R$ ").append(valorTotal()).append(" \n");
        return sb.toString();
    }

}
