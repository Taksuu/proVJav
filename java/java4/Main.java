public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        circulo.exibirNome();
        System.out.println("Área: " + circulo.calcularArea());

        Retangulo retangulo = new Retangulo(4.0, 6.0);
        retangulo.exibirNome();
        System.out.println("Área: " + retangulo.calcularArea());

        Quadrado quadrado = new Quadrado(4.0);
        quadrado.exibirNome();
        System.out.println("Área: " + quadrado.calcularArea());
    }
}