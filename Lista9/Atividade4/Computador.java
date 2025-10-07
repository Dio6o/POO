package Lista9.Atividade4;

public class Computador {

    private String marca;
    private String modelo;
    protected Gabinete gabinete;
    protected Teclado teclado;
    protected Mouse mouse;
    protected Monitor monitor;

    Computador(String marca, String modelo, Gabinete gabinete,Teclado teclado, Mouse mouse, Monitor monitor) {
        setMarca(marca);
        setModelo(modelo);
        setGabinete(gabinete);
        setTeclado(teclado);
        setMouse(mouse);
        setMonitor(monitor);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Gabinete getGabinete() {
        return gabinete;
    }

    public void setGabinete(Gabinete gabinete) {
        this.gabinete = gabinete;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computador{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", gabinete=").append(gabinete);
        sb.append(", teclado=").append(teclado);
        sb.append(", mouse=").append(mouse);
        sb.append(", monitor=").append(monitor);
        sb.append('}');
        return sb.toString();
    }

}
