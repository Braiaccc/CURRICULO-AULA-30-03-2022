class Animal2 {
    public void mover() {
        System.out.println("Animal se movendo");
    }
}

class Peixe extends Animal2 {
    @Override
    public void mover() {
        System.out.println("Nadando como um peixe");
    }
}

 class Main8 {
    public static void main(String[] args) {
        Animal2 animal2 = new Animal2();
        Peixe peixe = new Peixe();

        animal2.mover();
        peixe.mover();
    }
}
