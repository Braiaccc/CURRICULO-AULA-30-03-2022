public class Main {
    public static void main(String[] args) {
        Animal gato = new Animal("Tutui", 5, 4.2, "Felino");
        Veterinario veterinario = new Veterinario("Dr. Silva", "Veterinário", 5000.0, "Gatos");
        veterinario.realizarExame(gato);
    }
}
