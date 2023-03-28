package novo;

public class Trapezio {
    double baseMaior;
    double baseMenor;
    double h;
    double areaT;

    public double calcularAreaT(){
        areaT = (baseMaior + baseMenor) * h / 2;
        return areaT;
    }
}