public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Alice", 35, 8000.0, "Vendas");
        gerente.exibirInformacoesGerente();

        Desenvolvedor desenvolvedor = new Desenvolvedor("Carlos", 28, 6000.0, "Java");
        desenvolvedor.exibirInformacoesDesenvolvedor();
    }
}
