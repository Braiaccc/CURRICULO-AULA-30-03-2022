package semi;

public class Prova {
    private double notaParte1;
    private double notaParte2;

    public Prova(double notaParte1, double notaParte2) {
        this.notaParte1 = notaParte1;
        this.notaParte2 = notaParte2;
    }

    public double calcularNotaTotal() {
        double notaTotal = notaParte1 + notaParte2;
        return (notaTotal > 10.0) ? 10.0 : notaTotal;
    }
}