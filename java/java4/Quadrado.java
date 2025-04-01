class Quadrado extends Retangulo {
    public Quadrado(double lado) {
        super(lado, lado);
    }

    @Override
    public double calcularArea() {
        return Math.pow(super.largura, 2);
    }
}