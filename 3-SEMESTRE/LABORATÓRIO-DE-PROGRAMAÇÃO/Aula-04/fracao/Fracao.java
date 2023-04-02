package fracao;

public class Fracao {
    int numerador;
    int denominador;

    public Fracao(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fracao multiplicarFracao(Fracao x){
        int novoNumerador = x.numerador * this.numerador;
        int novoDenominador = x.denominador * this.denominador;
        Fracao resultado = new Fracao(novoNumerador, novoDenominador);
        return resultado;
    }

    public void getFracao(){
        System.out.println(this.numerador);
        System.out.println('-');
        System.out.println(this.denominador);
    }
    
    public static void main(String[] args) {
        Fracao x = new Fracao(1, 2);
        Fracao y = new Fracao(2, 3);
        Fracao z = x.multiplicarFracao(y);
        z.getFracao();
        
    }
}
