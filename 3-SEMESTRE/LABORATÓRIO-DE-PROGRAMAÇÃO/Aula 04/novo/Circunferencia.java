package novo;

public class Circunferencia {
     double diametro;
     double raio;
     double areaC;


    public double calcularAreaC(){
        raio = diametro / 2;
        areaC = Math.PI * Math.pow(raio, 2);
        return areaC;
    }
}
