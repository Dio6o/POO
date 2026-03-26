package Generics_e_Wildcard.atividade4;

public class ListaLinear {

    private Nodo inicio;

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public boolean vazia() {
        return inicio == null;
    }

    public <T> boolean inserirValor(String chave, T valor) {
        if (!existe(chave)){
            Nodo novoNodo = new Nodo(chave, valor);
            novoNodo.setProximo(inicio);
            setInicio(novoNodo);
            return true;
        }
        return false;
    }

    public <T> boolean existe(String chave){
        if (!vazia()) {
            Nodo aux = inicio.getProximo();
            while (aux != null) {
                if (aux.getChave().equals(chave)) {
                    return true;
                }
                aux = aux.getProximo();
            }
        }
        return false;
    }

    public void buscarChave(String chave){
        if (!vazia()) {
            Nodo aux = inicio;
            while (aux != null) {
                if (aux.getChave().equals(chave)) {
                    System.out.println("Chave: " + aux.getChave() + ", Valor: " + aux.getValor());
                    return;
                }
                aux = aux.getProximo();
            }
        }
        System.out.println("Chave não encontrada!");
    }


    public void mostrarLista() {
        if (!vazia()) {
            Nodo aux = inicio;
            while (aux != null) {
                System.out.println("Chave: " + aux.getChave() + ", Valor: " + aux.getValor());
                aux = aux.getProximo();
            }

        } else {
            System.out.println("Lista vazia");
        }
    }


}
