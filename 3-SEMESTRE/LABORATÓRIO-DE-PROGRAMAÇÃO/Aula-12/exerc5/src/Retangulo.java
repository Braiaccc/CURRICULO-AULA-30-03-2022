// Implementação da classe Retangulo que implementa a interface FormaGeometrica
public class Retangulo implements FormaGeometrica {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (altura + largura);
    }
}
