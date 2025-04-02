class ProdutoComDesconto extends Produto {
    private double desconto;

    public ProdutoComDesconto(String nome, double preco, double desconto) {
        super(nome, preco);
        this.desconto = desconto;
    }

    public void exibirDetalhesComDesconto() {
        double precoComDesconto = preco - (preco * desconto / 100);
        System.out.println("Nome: " + nome);
        System.out.println("Preço original: R$ " + preco);
        System.out.println("Desconto: " + desconto + "%");
        System.out.println("Preço com desconto: R$ " + precoComDesconto);
    }
}

