package Generics_e_Wildcard.atividade3;

public class NovoProduto extends ProdutoX {

    private String marca;

    public NovoProduto(String nome, double preco, int quantidade, String marca) {
        super(nome, preco, quantidade);
        setMarca(marca);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NovoProduto{");
        sb.append(super.toString());
        sb.append("marca='").append(marca).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
