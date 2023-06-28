public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 10);
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());

        Circulo circulo = new Circulo(3);
        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());

        Triangulo triangulo = new Triangulo(6, 4, 5, 5, 5);
        System.out.println("Área do triângulo: " + triangulo.calcularArea());
        System.out.println("Perímetro do triângulo: " + triangulo.calcularPerimetro());
    }
}
