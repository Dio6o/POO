package Generics_e_Wildcard.atividade3;

import java.util.ArrayList;

public class Pedido <T extends ProdutoX>{

    private ArrayList<T> produtos = new ArrayList<>();

    public Pedido() {
    }

    public ArrayList<T> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<T> produtos) {
        this.produtos = produtos;
    }

    public void addProduto(T produto){
        produtos.add(produto);
    }

    public void mostarProdutos(){
        for (ProdutoX produto: produtos){
            System.out.println(produto);
        }
    }

}
