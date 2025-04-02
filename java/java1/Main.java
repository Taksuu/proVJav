public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Camiseta", 49.90);
        ProdutoComDesconto produtoComDesconto = new ProdutoComDesconto("Calça Jeans", 120.00, 15);

        produto.exibirDetalhes();
        System.out.println();
        produtoComDesconto.exibirDetalhesComDesconto();
    }
}