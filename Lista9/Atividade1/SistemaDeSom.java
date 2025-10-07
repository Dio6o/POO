package Lista9.Atividade1;

public class SistemaDeSom extends EquipamentoEletronico {

    private String marca;
    private String modelo;
    private float potencia;

    SistemaDeSom() {
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

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SistemaDeSom{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", potencia=").append(potencia);
        sb.append('}');
        return sb.toString();
    }


}
