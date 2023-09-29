public class Celular {
    public String modelo;
    public double versao;
    int bateria;
    boolean acesso;

    void statusCel(){
        System.out.printf("O modelo do meu celular é da " + this.modelo);
        System.out.printf("\nA versão do meu celular é " + this.versao);
        System.out.printf("\nA porcentagem da minha bateria é " + this.bateria);
        System.out.printf("\nSe meu celular esta acesso: " + this.acesso);
    }

    void ligado(){
        if (acesso == true){
            System.out.printf("\nSeu celular esta ligado");
        } else{
            System.out.printf("\nSeu celular esta desligado");
        }
    }

    void desligar(){
        this.acesso = false;
    }

    void ligar(){
        this.acesso = true;
    }

}


