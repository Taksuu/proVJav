class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Salário: R$ " + salario);
    }
}