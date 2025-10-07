package misc;

public class Documento {

    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Documento() {
        setTexto("Bla, bla, bla");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Documento{");
        sb.append("texto='").append(texto).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
