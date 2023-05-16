class Produto {
    private int codigo;
    private double preco;

    public Produto(int codigo, double preco) {
        this.codigo = codigo;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }
}

class ProdutoPerecivel extends Produto {
    private String dataValidade;

    public ProdutoPerecivel(int codigo, double preco, String dataValidade) {
        super(codigo, preco);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }
}

 class Main7 {
    public static void main(String[] args) {
        Produto produto = new Produto(1, 10.0);
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel(2, 15.0, "31/12/2023");

        System.out.println("Produto: Código= " + produto.getCodigo() + ", Preço= " + produto.getPreco());
        System.out.println("Produto Perecível: Código= " + produtoPerecivel.getCodigo() + ", Preço= " + produtoPerecivel.getPreco() + ", Data de Validade=" + produtoPerecivel.getDataValidade());
    }
}
