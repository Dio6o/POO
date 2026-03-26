package Generics_e_Wildcard.atividade4;

public class Nodo <T> {

    private String chave;
    private Nodo proximo;
    private T valor;

    public Nodo() {}

    public Nodo(String chave, T valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Nodo{");
        sb.append("chave='").append(chave).append('\'');
        sb.append(", proximo=").append(proximo);
        sb.append(", valor=").append(valor);
        sb.append('}');
        return sb.toString();
    }
}
