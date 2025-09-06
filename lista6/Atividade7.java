package lista6;

public class Atividade7 {

    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void envelhecer(int anos){
        if (anos < 1){
            System.out.println("Valor invalido!");
        } else {
            if(this.getIdade() < 21){
                this.setAltura(this.getAltura() + (0.05 * anos));
            }
            this.setIdade(this.getIdade() + anos);
        }
    }

    public void engordar(double peso){
        if (peso < 1){
            System.out.println("Valor invalido!");
        } else {
            this.setPeso(this.getPeso() + peso);
        }
    }

    public void emagrecer(double peso){
        if (peso < 1){
            System.out.println("Valor invalido!");
        } else {
            this.setPeso(this.getPeso() - peso);
        }
    }

    public void crescer(double altura){
        if (altura < 0){
            System.out.println("Valor invalido!");
        } else {
            this.setAltura(this.getAltura() + altura);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("nome='").append(nome).append('\'');
        sb.append(", idade=").append(idade);
        sb.append(", altura=").append(altura);
        sb.append(", peso=").append(peso);
        return sb.toString();
    }
}
