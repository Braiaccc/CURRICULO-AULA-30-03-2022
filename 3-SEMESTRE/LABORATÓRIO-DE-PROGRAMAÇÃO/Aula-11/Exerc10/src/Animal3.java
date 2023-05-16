class Animal3 {
    public void emitirSom() {
        System.out.println("Som do animal");
    }
}

class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}

class Main10 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Gato gato = new Gato();

        animal.emitirSom();
        gato.emitirSom();
    }
}
