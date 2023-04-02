package exercicio2;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Ford", "Fiesta", 2010);

        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());

        carro.setMarca("Chevrolet");
        carro.setModelo("Cruze");
        carro.setAno(2020);

        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
    }
}
