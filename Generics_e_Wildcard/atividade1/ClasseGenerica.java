package Generics_e_Wildcard.atividade1;

public class ClasseGenerica <T> {

    private T valor;

    public ClasseGenerica(T valor) {
        setValor(valor);
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public void print(){
        System.out.println(getValor());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClasseGenerica{");
        sb.append("valor=").append(valor);
        sb.append('}');
        return sb.toString();
    }
}
