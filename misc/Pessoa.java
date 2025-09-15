package misc;

public class Pessoa {

    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        setNome(nome);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void envelcher(int idade){
        if(getIdade() < 21){
            setAltura(getAltura() + (idade * 0.05));
        }
        setIdade(getIdade() + idade);
    }

    public void engordar (double peso){
        setPeso(getPeso() + peso);
    }

    public void emagrecer(double peso){
        setPeso(getPeso() - peso);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pessoa{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", idade=").append(idade);
        sb.append(", peso=").append(peso);
        sb.append(", altura=").append(altura);
        sb.append('}');
        return sb.toString();
    }
}
