class Pessoa2 {
    public void falar() {
        System.out.println("Pessoa falando");
    }

    public void andar() {
        System.out.println("Pessoa andando");
    }
}

class Estudante extends Pessoa2 {
    public void estudar() {
        System.out.println("Estudante estudando");
    }
}
class Main6 {
    public static void main(String[] args) {
        Pessoa2 pessoa2 = new Pessoa2();
        Estudante estudante = new Estudante();

        pessoa2.falar();
        pessoa2.andar();
        estudante.falar();
        estudante.andar();
        estudante.estudar();
    }
}

