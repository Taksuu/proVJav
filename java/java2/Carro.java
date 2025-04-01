class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String modelo, String placa, int ano, int numeroPortas) {
        super(modelo, placa, ano);
        this.numeroPortas = numeroPortas;
    }

    public void exibirInformacoesCarro() {
        super.exibirInformacoes();
        System.out.println("Número de portas: " + numeroPortas);
    }
}