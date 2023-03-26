package geometricas;
public class Circunferencia {
    private double diametro;
    private double raio;
    private double area;

    public Circunferencia(double diametro){
        this.diametro = diametro;
        this.raio = diametro / 2;
    }

    public double calcularArea(){
        area = Math.PI * Math.pow(raio, 2);
        return area;
    }

    public static void main(String[] args) {
        Circunferencia x = new Circunferencia(10);
        System.out.println(x.calcularArea());
    }
}
