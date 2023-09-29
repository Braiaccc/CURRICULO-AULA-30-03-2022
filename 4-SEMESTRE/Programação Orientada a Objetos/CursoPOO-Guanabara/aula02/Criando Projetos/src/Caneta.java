public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    void status(){
        System.out.print("Uma caneta " + this.cor);
        System.out.print("\nesta tampada? " + this.tampada);
        System.out.print("\nAinda possui " + this.carga + " ml");
        System.out.print("\nO modelo dela é " + this.modelo);
        System.out.print("\nA ponta da caneta tem " + this.ponta + " CM\n\n");


    }
    public void rabiscar(){
        if (this.tampada == true){
            System.out.printf("Erro, a caneta esta tampada\n");
        } else {
            System.out.printf("Voce rabiscou a folha\n");
        }
    }

    protected void tampar(){
        this.tampada = true;
    }

    protected void destampar(){
        this.tampada = false;
    }
}
