package geometricas;

public class Quadrado {
    private double lado;
    private double area;

    public Quadrado(double lado){
        this.lado = lado;
    }

    public double calcularArea(){
        this.area = lado * lado;
        return area;
    }

    public static void main(String[] args) {
        Quadrado quad = new Quadrado(2);
        double area = quad.calcularArea();
        System.out.println(area);
    }
}
