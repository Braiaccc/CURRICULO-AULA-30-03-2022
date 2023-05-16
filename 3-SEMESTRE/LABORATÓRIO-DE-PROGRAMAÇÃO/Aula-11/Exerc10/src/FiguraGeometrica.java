abstract class FiguraGeometrica {
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}

class Quadrado extends FiguraGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}

  class Main3 {
    public static void main(String[] args) {
        FiguraGeometrica figura = new Quadrado(5.0);
        Quadrado quadrado = new Quadrado(5.0);

        System.out.println("Área do quadrado: " + figura.calcularArea());
        System.out.println("Perímetro do quadrado: " + figura.calcularPerimetro());
        System.out.println("Lado do quadrado: " + quadrado.getLado());
    }
}
