// Implementação da classe Triangulo que implementa a interface FormaGeometrica
public class Triangulo implements FormaGeometrica {
    private double base;
    private double altura;
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double base, double altura, double ladoA, double ladoB, double ladoC) {
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }
}
