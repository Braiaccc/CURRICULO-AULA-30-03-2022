public class Livro {
    String titulo;
    int paginas;
    String estado;
    boolean condicaoLivro;

    void statusLivro(){
        System.out.printf("\nO titulo do livro é: " + this.titulo);
        System.out.printf("\nO livro possui " + this.paginas + " páginas");
        System.out.printf("\nO livro se encontra num estado " + this.estado);
        System.out.printf("\nO livro esta " + this.condicaoLivro);
    }

    void condicao(){
        if (this.condicaoLivro == true){
            System.out.printf("\nO livro esta aberto");
        } else{
            System.out.printf("\nO livro esta fechado");
        }
    }
    void abrir(){
        this.condicaoLivro = true;
    }
    void fechar(){
        this.condicaoLivro = false;
    }
}


