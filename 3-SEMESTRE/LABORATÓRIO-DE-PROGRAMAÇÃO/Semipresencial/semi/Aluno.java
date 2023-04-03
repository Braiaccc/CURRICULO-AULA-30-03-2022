package semi;

import java.util.ArrayList;

public class Aluno {
    private ArrayList<Prova> provas;

    public Aluno() {
        provas = new ArrayList<Prova>();
    }

    public void adicionarProva(Prova prova) {
        provas.add(prova);
    }

    public double calcularMedia() {
        double notaTotal = 0.0;
        for (Prova prova : provas) {
            notaTotal += prova.calcularNotaTotal();
        }
        return notaTotal / provas.size();
    }
}