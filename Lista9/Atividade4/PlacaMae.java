package Lista9.Atividade4;

public class PlacaMae {

    private String marca;
    private String modelo;
    protected Processador processador;
    protected Hd hd;
    protected Memoria memoria;

    PlacaMae(String marca, String modelo, Processador processador, Hd hd, Memoria memoria) {
        setMarca(marca);
        setModelo(modelo);
        setProcessador(processador);
        setHd(hd);
        setMemoria(memoria);
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

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public Hd getHd() {
        return hd;
    }

    public void setHd(Hd hd) {
        this.hd = hd;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlacaMae{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", processador=").append(processador);
        sb.append(", hd=").append(hd);
        sb.append(", memoria=").append(memoria);
        sb.append('}');
        return sb.toString();
    }

}
