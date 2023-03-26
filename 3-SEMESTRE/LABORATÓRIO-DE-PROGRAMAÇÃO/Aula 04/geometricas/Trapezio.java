package geometricas;

public class Trapezio {
    private double baseMaior;
    private double baseMenor;
    private double h;
    private double area;

    public Trapezio(double baseMaior, double baseMenor, double h){
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.h = h;
    }

    public double calcularArea(){
        area = (baseMaior + baseMenor) * h / 2;
        return area;
    }

    public static void main(String[] args) {
        Trapezio x = new Trapezio(5, 2, 3);
        System.out.println(x.calcularArea());
    }
}
