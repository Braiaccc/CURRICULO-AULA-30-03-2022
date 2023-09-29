
public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.rabiscar();
        c1.carga = 10;
        c1.modelo = "bic";
        c1.status();


        c2.cor = "Preta";
        c2.ponta = 0.1f;
        c2.destampar();
        c2.rabiscar();
        c2.carga = 12;
        c2.modelo = "polishop";
        c2.status();

        Livro l = new Livro();
        l.paginas = 800;
        l.fechar();
        l.titulo = "Harry potter";
        l.estado = "ruim";
        l.statusLivro();
        l.condicao();
    }
}

