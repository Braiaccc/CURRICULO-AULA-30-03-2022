class Animal {
    public void emitirSom() {
        System.out.println("Som do animal");
    }
}

class Cachorro extends Animal {
    public void latir() {
        System.out.println("Au au!");
    }
}

 class Main5 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();

        animal.emitirSom();
        cachorro.emitirSom();
        cachorro.latir();
    }
}

