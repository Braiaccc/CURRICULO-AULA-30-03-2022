package novo;

public class Main{
    public static void main(String[] args) {
        Quadrado quad = new Quadrado();
        quad.lado = 2;
        double area = quad.calcularAreaQ();
        System.out.println(area);

        Trapezio x = new Trapezio();
        x.baseMaior = 5;
        x.baseMenor = 2;
        x.h = 3;
        double areaT = x.calcularAreaT();
        System.out.println(areaT);

        Triangulo t = new Triangulo();
        t.base = 3;
        t.h = 5;
        double areaTr = t.calcularAreaTr();
        System.out.println(areaTr);

        Circunferencia c = new Circunferencia();
        c.diametro = 10;
        double areaC = c.calcularAreaC();
        System.out.println(areaC);
    }
}

