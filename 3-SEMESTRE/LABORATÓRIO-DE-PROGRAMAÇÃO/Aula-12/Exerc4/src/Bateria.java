// Implementação da classe Bateria que implementa as interfaces Carregável e Descarregável
public class Bateria implements Carregável, Descarregável {
    @Override
    public void carga() {
        System.out.println("Bateria sendo carregada ou descarregada...");
        // Lógica para carregar ou descarregar a bateria...
    }
}
