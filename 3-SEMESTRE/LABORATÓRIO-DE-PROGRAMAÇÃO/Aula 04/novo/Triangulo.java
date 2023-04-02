package novo;

public class Triangulo {
   double base;
   double h;
   double areaTr;

   public double calcularAreaTr(){
        areaTr = base * h / 2;
        return areaTr;
   }
}