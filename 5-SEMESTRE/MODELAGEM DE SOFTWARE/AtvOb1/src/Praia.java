public class Praia {
    private String nome;
    private String localizacao;
    private int temperaturaAgua;
    private String tipoAreia;

    public Praia(String nome, String localizacao, int temperaturaAgua, String tipoAreia){
        this.nome = nome;
        this.localizacao = localizacao;
        this.temperaturaAgua = temperaturaAgua;
        this.tipoAreia = tipoAreia;
    }

    public String informacoesPraia(){
        return "Nome da praia " + nome + "\nLocalização " + localizacao + "\nTemperatura da agua " + temperaturaAgua + "graus" + "\nEstado da areia " + tipoAreia;
    }

    public static void main(String[] args) {
        Praia praia1 = new Praia("Beira mar", "Capao da canoa", 25, "umida");

        System.out.println(praia1.informacoesPraia());
    }
}
