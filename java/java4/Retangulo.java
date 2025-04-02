class Retangulo extends Forma {
    private double largura, altura;
    public Retangulo(double largura, double altura) { super("Retângulo"); this.largura = largura; this.altura = altura; }
    @Override
    public double calcularArea() { return largura * altura; }
}

