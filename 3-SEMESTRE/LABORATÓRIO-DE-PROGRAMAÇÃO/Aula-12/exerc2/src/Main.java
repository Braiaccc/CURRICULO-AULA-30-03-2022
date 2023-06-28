public class Main {
    public static void main(String[] args) {
        Aviao aviao = new Aviao();
        aviao.decolar();
        aviao.voar();
        aviao.aterrar();

        Passaro passaro = new Passaro();
        passaro.decolar();
        passaro.voar();
        passaro.aterrar();

        Superman superman = new Superman();
        superman.decolar();
        superman.voar();
        superman.aterrar();
    }
}
