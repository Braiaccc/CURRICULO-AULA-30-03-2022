public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = 0.0;
    }

    // getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 35.90);
        Livro livro2 = new Livro("O Alienista", "Machado de Assis");

        System.out.println("Titulo: " + livro1.getTitulo() + ", autor: " + livro1.getAutor() + ", R$ = " + livro1.getPreco());
        System.out.println("Titulo: " + livro2.getTitulo() + ", autor: " + livro2.getAutor() + ", R$ = " + livro2.getPreco());
    }
}


