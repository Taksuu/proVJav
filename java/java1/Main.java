public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Produto A", 100.0);
        produto.exibirDetalhes();

        ProdutoDesconto produtoDesconto = new ProdutoDesconto("Produto B", 200.0, 20.0);
        produtoDesconto.exibirDetalhesDesconto();
    }
}