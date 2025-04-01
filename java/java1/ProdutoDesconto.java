class ProdutoDesconto extends Produto {
    private double desconto;

    public ProdutoDesconto(String nome, double preco, double desconto) {
        super(nome, preco);
        this.desconto = desconto;
    }

    public void exibirDetalhesDesconto() {
        double precoDesconto = super.preco - desconto;
        System.out.println("Produto: " + super.nome + ", Preço original: R$ " + super.preco + 
                           ", Desconto: R$ " + desconto + ", Preço com desconto: R$ " + precoComDesconto);
    }
}