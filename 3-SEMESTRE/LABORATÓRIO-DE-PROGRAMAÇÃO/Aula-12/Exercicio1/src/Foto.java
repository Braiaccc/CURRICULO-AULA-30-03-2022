// Definição da classe Foto que implementa a interface Imprimivel
public class Foto implements Imprimivel {
    private String nomeArquivo;

    public Foto(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo foto: " + nomeArquivo);
        // Lógica para impressão da foto...
    }
}
