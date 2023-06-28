import java.rmi.MarshalException;

public class Main {
    public static void main(String[] args) {
        Animal tigre = new Animal("Michelangelo", 24, 170, "Pintada");
        tigre.movimentar();
        tigre.movimentar("Atacar");

        Mamifero cachorro = new Mamifero("Roco", 2, 16, "Salsicha", "lisa");
        cachorro.movimentar();
        cachorro.movimentar("correr");

        Ave periquito = new Ave("Pappon", 3, 150, "Caturrita", 67);
        periquito.voar();
        periquito.realizarTruque();
        periquito.movimentar();
        periquito.movimentar("pular");



        Veterinario veterinario1 = new Veterinario("Bryan Martinez", "Responsável veterinario do Zoológico",6400, "Eutanásia");
        veterinario1.realizarExame(periquito); //R.I.P Lil Papa
        Veterinario veterinario2 = new Veterinario("Joao silva", "Veterinário Geral", 3000.0, "Animais pequenos");
        Veterinario veterinario3 = new Veterinario("Lucas Ribeiro", "Veterinário de Exóticos", 4500.0, "Animais exóticos e silvestres");
        Funcionario funcionario1 = new Funcionario("Vitor Bernandino", "limpeza", 1300);
        Funcionario funcionario2 = new Funcionario("Gabriel silva", "Banho em felinos", 3500);

        Zoo zoo = new Zoo(3, 5);

        zoo.adicionar(tigre);
        zoo.adicionar(periquito);
        zoo.adicionar(cachorro);
        zoo.adicionar(cachorro);
        zoo.adicionar(cachorro);
        zoo.adicionar(cachorro);
        zoo.adicionar(cachorro);


        zoo.adicionar(veterinario1);
        zoo.adicionar(veterinario2);
        zoo.adicionar(veterinario3);
        zoo.adicionar(funcionario1);
        zoo.adicionar(funcionario2);
        zoo.adicionar(funcionario2);
        zoo.adicionar(funcionario2);
        zoo.adicionar(funcionario2);
        zoo.adicionar(funcionario2);
        zoo.adicionar(funcionario2);

    }
}