public class Main {
    public static void main(String[] args) {
        Documento documento = new Documento("Conteúdo do documento");
        documento.imprimir();

        Foto foto = new Foto("foto.jpg");
        foto.imprimir();
    }
}
