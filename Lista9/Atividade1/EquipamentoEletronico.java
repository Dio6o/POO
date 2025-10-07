package Lista9.Atividade1;

public class EquipamentoEletronico {

    private float tensao;
    private float consumo;

    public EquipamentoEletronico() {
    }

    public float getTensao() {
        return tensao;
    }

    public void setTensao(float tesao) {
        this.tensao = tesao;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EquipamentoEletronico{");
        sb.append("tensao=").append(tensao);
        sb.append(", consumo=").append(consumo);
        sb.append('}');
        return sb.toString();
    }
}
