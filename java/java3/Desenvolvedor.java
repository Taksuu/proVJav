class Desenvolvedor extends Funcionario {
    private String linguagemProgramacao;

    public Desenvolvedor(String nome, int idade, double salario, String linguagemProgramacao) {
        super(nome, idade, salario);
        this.linguagemProgramacao = linguagemProgramacao;
    }

    public void exibirInformacoesDesenvolvedor() {
        super.exibirInformacoes();
        System.out.println("Linguagem de Programação: " + linguagemProgramacao);
    }
}