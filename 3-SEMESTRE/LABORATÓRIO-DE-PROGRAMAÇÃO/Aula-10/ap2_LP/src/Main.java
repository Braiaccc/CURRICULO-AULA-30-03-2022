abstract class Produto {
    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract String detalhesDoProduto();
}

class Livro extends Produto {
    private String autor;
    private int anoPublicacao;
    private boolean disponibilidade;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String detalhesDoProduto() {
        return "Título: " + getTitulo() + "\nAutor: " + getAutor() + "\nAno de Publicação: " + getAnoPublicacao() +
                "\nDisponibilidade: " + (disponibilidade ? "Disponível" : "Indisponível");
    }
}

class Biblioteca {
    private Livro livro1 = new Livro();
    private Livro livro2 = new Livro();
    private Livro livro3 = new Livro();
    private Livro livro4 = new Livro();
    private Livro livro5 = new Livro();

    public Livro getLivro1() {
        return livro1;
    }

    public Livro getLivro2() {
        return livro2;
    }

    public Livro getLivro3() {
        return livro3;
    }

    public Livro getLivro4() {
        return livro4;
    }

    public Livro getLivro5() {
        return livro5;
    }

    public void adicionarLivro(Livro livro) {
        if (livro1 == null) {
            livro1 = livro;
        } else if (livro2 == null) {
            livro2 = livro;
        } else if (livro3 == null) {
            livro3 = livro;
        } else if (livro4 == null) {
            livro4 = livro;
        } else if (livro5 == null) {
            livro5 = livro;
        } else {
            System.out.println("\nA biblioteca está lotada. Não é possível adicionar mais livros.\n");

        }

    }

    public void removerLivro(Livro livro) {
        if (livro1 == livro) {
            livro1 = null;
        } else if (livro2 == livro) {
            livro2 = null;
        } else if (livro3 == livro) {
            livro3 = null;
        } else if (livro4 == livro) {
            livro4 = null;
        } else if (livro5 == livro) {
            livro5 = null;
        }
    }

    public void atualizarDetalhesLivro(Livro livro, String titulo, String autor, int anoPublicacao, boolean isDisponibilidade) {
        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setAnoPublicacao(anoPublicacao);
        livro.setDisponibilidade(isDisponibilidade);
    }

    public boolean verificarDisponibilidadeLivro(Livro livro) {
        return livro.isDisponibilidade();
    }


}
public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro();
        livro1.setTitulo("Harry Potter");
        livro1.setAutor("J.K Rowling");
        livro1.setAnoPublicacao(1995);
        livro1.setDisponibilidade(true);
        biblioteca.adicionarLivro(livro1);

        Livro livro2 = new Livro();
        livro2.setTitulo("Percy Jackson");
        livro2.setAutor("Rick");
        livro2.setAnoPublicacao(2005);
        livro2.setDisponibilidade(false);
        biblioteca.adicionarLivro(livro2);


        // Verificar a disponibilidade de um livro
        System.out.println("Disponibilidade do " + livro1.getTitulo() + ": " + biblioteca.verificarDisponibilidadeLivro(livro1));

        // Atualizar detalhes de um livro

       biblioteca.atualizarDetalhesLivro(livro1, "Harry Potter", "J.K ROWLING", 1996, false);

        // Remover um livro

         // biblioteca.removerLivro(livro1);

        // Adicionar um novo livro
        Livro livro3 = new Livro();
        livro3.setTitulo("o chamado de cthulhu");
        livro3.setAutor("H. P. Lovecraft");
        livro3.setAnoPublicacao(2005);
        livro3.setDisponibilidade(true);
        biblioteca.adicionarLivro(livro3);

        Livro livro4 = new Livro();
        livro4.setTitulo("Diario de um banana");
        livro4.setAutor("Jeff Kinney");
        livro4.setAnoPublicacao(2007);
        livro4.setDisponibilidade(true);
        biblioteca.adicionarLivro(livro4);

        Livro livro5 = new Livro();
        livro5.setTitulo("A revolução dos bichos");
        livro5.setAutor("George Orwell");
        livro5.setAnoPublicacao(1945);
        livro5.setDisponibilidade(false);
        biblioteca.adicionarLivro(livro5);

        Livro livro6 = new Livro();
        livro6.setTitulo("A revolução dos bichos");
        livro6.setAutor("George Orwell");
        livro6.setAnoPublicacao(1945);
        livro6.setDisponibilidade(false);
        biblioteca.adicionarLivro(livro6);



        // Exibir detalhes dos livros na biblioteca
        Livro[] livros = {biblioteca.getLivro1(), biblioteca.getLivro2(), biblioteca.getLivro3(), biblioteca.getLivro4(), biblioteca.getLivro5()};
        for (Livro livro : livros) {
            if (livro != null) {
                System.out.println(livro.detalhesDoProduto());
                System.out.println();
            }
        }

    }
}
