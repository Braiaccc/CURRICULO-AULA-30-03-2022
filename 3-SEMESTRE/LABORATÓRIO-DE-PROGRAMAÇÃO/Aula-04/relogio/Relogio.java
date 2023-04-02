public class Relogio{
    
    private Ponteiro ponteiroHora;
    private Ponteiro ponteiroMinuto;
    private Ponteiro ponteiroSegundo;

    public Relogio(){
        ponteiroHora = new Ponteiro();
        ponteiroMinuto = new Ponteiro();
        ponteiroSegundo = new Ponteiro();
    }

    public void acertarRelogio(int hora, int minuto, int segundo){
        ponteiroHora.setPos(hora % 12);
        ponteiroMinuto.setPos(minuto / 5);
        ponteiroSegundo.setPos(segundo / 5);
    }

    public int lerHora(){
        return ponteiroHora.getPos();
    }

    public int lerMinuto(){
        return ponteiroMinuto.getPos() * 5;
    }

    public int lerSegundo(){
        return ponteiroSegundo.getPos() * 5;
    }

    public static void main(String[] args) {
        Relogio relogio = new Relogio();

        // Acerta o relógio para as 3 horas, 25 minutos e 50 segundos
        relogio.acertarRelogio(3, 25, 50);

        // Exibe a hora atual
        System.out.println("Hora: " + relogio.lerHora());

        // Exibe o minuto atual
        System.out.println("Minuto: " + relogio.lerMinuto());

        // Exibe o segundo atual
        System.out.println("Segundo: " + relogio.lerSegundo());
    }
}

