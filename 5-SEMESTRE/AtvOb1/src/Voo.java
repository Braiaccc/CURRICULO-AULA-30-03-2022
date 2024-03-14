public class Voo {
    private String companhiaAerea;
    private String origem;
    private String destino;
    private String dataPartida;
    private float precoPassagem;

    public Voo(String companhiaAerea, String origem, String destino, String dataPartida, float precoPassagem){
        this.companhiaAerea = companhiaAerea;
        this.origem = origem;
        this.destino = destino;
        this.dataPartida = dataPartida;
        this.precoPassagem = precoPassagem;
    }

    public String informacoesVoo(){
        return "Companhia Aerea " + companhiaAerea + "\nOrigem " + origem + "\nDestino " + destino + "\nData da partida " + dataPartida + "\nPreço " + precoPassagem;
    }

    public static void main(String[] args) {
        Voo voo1 = new Voo("Aeros", "POA", "Xangri-la", "11/09/11", 1999);
        System.out.println(voo1.informacoesVoo());
    }
}
