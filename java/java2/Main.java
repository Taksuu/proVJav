public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Fusca", "GHJK-9281", 1970, 4);
        carro.exibirInformacoesCarro();

        Moto moto = new Moto("Honda", "VCNA-9188", 2020, 150);
        moto.exibirInformacoesMoto();
    }
}
