public class Equipe {
    private String nome;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Equipe(String nome) {
        this.nome = nome;
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void registrarVitoria() {
        this.vitorias++;
    }

    public void registrarDerrota() {
        this.derrotas++;
    }

    public void registrarEmpate() {
        this.empates++;
    }
}
