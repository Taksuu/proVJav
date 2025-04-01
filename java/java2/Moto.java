class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String modelo, String placa, int ano, int cilindrada) {
        super(modelo, placa, ano);
        this.cilindrada = cilindrada;
    }

    public void exibirInformacoesMoto() {
        super.exibirInformacoes();
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }
}