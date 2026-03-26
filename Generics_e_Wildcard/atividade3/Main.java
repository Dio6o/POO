package Generics_e_Wildcard.atividade3;

public class Main {
    public static void main(String[] args) {

        Pedido<ProdutoX> pedido = new Pedido<>();
        ProdutoX produto1 = new ProdutoX("whey", 100.99, 2);
        ProdutoX produto2 = new ProdutoX("creatina", 35.49, 1);
        ProdutoX produto3 = new ProdutoX("Bcaa", 58.60, 4);
        pedido.addProduto(produto1);
        pedido.addProduto(produto2);
        pedido.addProduto(produto3);

        pedido.mostarProdutos();

        // Novo produto é subclasse de produtoX
        NovoProduto novoProduto = new NovoProduto("whey", 130.99, 2, "Integral");

        pedido.addProduto(novoProduto);

        pedido.mostarProdutos();


    }
}
