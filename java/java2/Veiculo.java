class Veiculo {
    private String modelo;
    private String placa;
    private int ano;

    public Veiculo(String modelo, String placa, int ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo + ", Placa: " + placa + ", Ano: " + ano);
    }
}
