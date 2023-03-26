package geometricas;

public class Triangulo {
   private double base;
   private double h;
   private double area;

   public Triangulo(double base, double h){
        this.base = base;
        this.h = h;
   }

   public double calcularArea(){
        this.area = (this.base * this.h) / 2;
        return area;
   }

   public static void main(String[] args) {
        Triangulo t = new Triangulo(3, 5);
        System.out.println(t.calcularArea());

   }
}
