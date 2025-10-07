package Lista9.Atividade4;

public class Gabinete {

    private String modelo;
    private String tipo;
    private int baias;
    protected PlacaMae placaMae;

    Gabinete(String modelo, String tipo, int baias, PlacaMae placaMae) {
        setModelo(modelo);
        setTipo(tipo);
        setBaias(baias);
        setPlacaMae(placaMae);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getBaias() {
        return baias;
    }

    public void setBaias(int baias) {
        this.baias = baias;
    }

    public PlacaMae getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(PlacaMae placaMae) {
        this.placaMae = placaMae;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Gabinete{");
        sb.append("modelo='").append(modelo).append('\'');
        sb.append(", tipo='").append(tipo).append('\'');
        sb.append(", baias=").append(baias);
        sb.append(", placaMae=").append(placaMae);
        sb.append('}');
        return sb.toString();
    }

}
