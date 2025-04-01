class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, int idade, double salario, String departamento) {
        super(nome, idade, salario);
        this.departamento = departamento;
    }

    public void exibirInformacoesGerente() {
        super.exibirInformacoes();
        System.out.println("Departamento: " + departamento);
    }
}
