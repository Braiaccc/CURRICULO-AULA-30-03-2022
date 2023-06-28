// Implementação da classe Documento que implementa a interface Imprimivel
public class Documento implements Imprimivel {
    private String conteudo;

    public Documento(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        System.out.println(conteudo);
    }
}

