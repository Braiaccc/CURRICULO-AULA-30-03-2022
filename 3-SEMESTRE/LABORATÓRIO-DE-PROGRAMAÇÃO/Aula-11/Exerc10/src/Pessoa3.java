class Pessoa3 {
    private String nome;
    private String endereco;

    public Pessoa3(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
}

class Cliente extends Pessoa3 {
    private String numeroCartao;

    public Cliente(String nome, String endereco, String numeroCartao) {
        super(nome, endereco);
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }
}

 class Main9 {
    public static void main(String[] args) {
        Pessoa3 pessoa3 = new Pessoa3("João", "Rua A, 123");
        Cliente cliente = new Cliente("Maria", "Rua B, 456", "7890123456");

        System.out.println("Pessoa: " + pessoa3.getNome() + ", " + pessoa3.getEndereco());
        System.out.println("Cliente: " + cliente.getNome() + ", " + cliente.getEndereco() + ", " + cliente.getNumeroCartao());
    }
}
