public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Fusca", "ABC-1234", 1970, 4);
        carro.exibirInformacoesCarro();

        Moto moto = new Moto("Honda", "XYZ-5678", 2020, 150);
        moto.exibirInformacoesMoto();
    }
}