package Lista9.Atividade2;

public class Carro {

    private String fabricante;
    private String modelo;
    private String cor;
    private int ano;

    protected Motor motor;
    protected Pessoa pessoa;

    Carro(String fabricante, String modelo, String cor, int ano,  Motor motor, Pessoa pessoa) {
        setFabricante(fabricante);
        setModelo(modelo);
        setCor(cor);
        setAno(ano);
        setMotor(motor);
        setPessoa(pessoa);
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Carro{");
        sb.append("fabricante='").append(fabricante).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", cor='").append(cor).append('\'');
        sb.append(", ano=").append(ano);
        sb.append(", motor=").append(motor);
        sb.append(", pessoa=").append(pessoa);
        sb.append('}');
        return sb.toString();
    }

}
