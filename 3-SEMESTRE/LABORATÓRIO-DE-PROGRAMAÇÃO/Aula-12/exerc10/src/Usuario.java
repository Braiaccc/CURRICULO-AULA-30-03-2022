// Implementação da classe Usuario que implementa a interface Persistente
public class Usuario implements Persistente {
    @Override
    public void salvar() {
        System.out.println("O usuário foi salvo no banco de dados.");
    }

    @Override
    public void atualizar() {
        System.out.println("O usuário foi atualizado no banco de dados.");
    }

    @Override
    public void deletar() {
        System.out.println("O usuário foi deletado do banco de dados.");
    }

    @Override
    public void buscar() {
        System.out.println("O usuário foi buscado no banco de dados.");
    }
}
