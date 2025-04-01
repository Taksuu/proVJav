public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Camisa", 100.0);
        produto.exibirDetalhes();

        ProdutoDesconto produtoDesconto = new ProdutoDesconto("Sapato", 200.0, 20.0);
        produtoDesconto.exibirDetalhesDesconto();
    }
}
