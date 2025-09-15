package Lista7;

public class Cone {

    private double raio;
    private double altura;
    private int tipo;
    final double PI = 3.14;
    final double TAMANHOLATA = 18;
    final double RENDIMENTO = 3.45;


    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio > 0) {
            this.raio = raio;
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }else {
            System.out.println("Valor inválido.");
        }
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        if (tipo > 0) {
            this.tipo = tipo;
        }else {
            System.out.println("Valor inválido.");
        }
    }

    public Cone(double raio, double altura, int tipo) {
        setRaio(raio);
        setAltura(altura);
        setTipo(tipo);
    }

    // Methods

    public double geratriz(){
        //Geratriz, g^2 = h^2 + r^2
        return Math.sqrt(Math.pow(getRaio(), 2) + Math.pow(getAltura(), 2));
    }

    //Area circulo = fundo cone
    public double areaCirculo(){
        return PI * getRaio() * getRaio();
    }

    //Area total = lateral + fundo
    public double areaTotal(){
        return PI * getRaio() * (getRaio() + geratriz());
    }

    public double areaLateral(){
        return areaTotal() - areaCirculo();
    }

    public double totalLitros(){
        return areaTotal() / RENDIMENTO;
    }

    public double totalLatas(){
        return Math.ceil(totalLitros() / TAMANHOLATA);
    }

    public double tipoTinta(){
        double valor = 0;
        if (getTipo() == 1){
            valor = 238.9;
        }  else if (getTipo() == 2){
            valor = 467.98;
        } else if (getTipo() == 3){
            valor = 758.34;
        } else {
            System.out.println("Tipo invalido.");
        }

        return valor;
    }

    public double total(){
        return totalLatas() * tipoTinta();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Raio: ").append(raio).append(" \n");
        sb.append("Altura: ").append(altura).append(" \n");
        sb.append("Tipo: ").append(tipo).append(" \n");
        sb.append("_______________________\n");
        sb.append("Geratriz: ").append(geratriz()).append(" \n");
        sb.append("_______________________\n");
        sb.append("Área do Fundo: ").append(areaCirculo()).append(" \n");
        sb.append("Área Lateral do Cone: ").append(areaLateral()).append(" \n");
        sb.append("Área Total: ").append(areaTotal()).append(" \n");
        sb.append("_______________________\n");
        sb.append("Total Litros: ").append(totalLitros()).append(" \n");
        sb.append("Total Latas: ").append(totalLatas()).append(" \n");
        sb.append("_______________________\n");
        sb.append("Valor  Total: R$ ").append(total()).append(" \n");
        return sb.toString();
    }
}
