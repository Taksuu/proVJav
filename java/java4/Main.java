public class Main {
    public static void main(String[] args) {
        Forma circulo = new Circulo(5.0);
        Forma retangulo = new Retangulo(4.0, 6.0);
        Forma quadrado = new Quadrado(4.0);

        circulo.exibirNome();
        System.out.println("Área: " + circulo.calcularArea() + "\n");

        retangulo.exibirNome();
        System.out.println("Área: " + retangulo.calcularArea() + "\n");

        quadrado.exibirNome();
        System.out.println("Área: " + quadrado.calcularArea() + "\n");
    }
}
