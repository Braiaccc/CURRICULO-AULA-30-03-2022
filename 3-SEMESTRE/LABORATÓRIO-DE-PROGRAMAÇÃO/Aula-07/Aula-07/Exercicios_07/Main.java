
public class Main {

    public static void main(String[] args) {
        

        Produto produto1 = new Produto(null, 0, 0);
        produto1.setNome("Arroz");
        produto1.setPreco(10.0);
        produto1.setQuantidade(20);
        
        Produto produto2 = new Produto(null, 0, 0);
        produto2.setNome("Feijão");
        produto2.setPreco(8.0);
        produto2.setQuantidade(15);
        
        Produto produto3 = new Produto(null, 0, 0);
        produto3.setNome("Macarrão");
        produto3.setPreco(5.0);
        produto3.setQuantidade(25);
        
        Loja loja = new Loja();
        
        loja.adicionarProduto(produto1);
        loja.adicionarProduto(produto2);
        loja.adicionarProduto(produto3);
        
        System.out.println("Produtos disponíveis na loja:");
        loja.listarProdutos();
        
        Produto produtoVenda = produto1;
        int quantidadeVenda = 5;
        System.out.println("Venda de " + quantidadeVenda + " unidades do produto " + produtoVenda.getNome());
        loja.venderProduto(produtoVenda, quantidadeVenda);
        
        Produto produtoEstoque = produto2;
        int quantidadeEstoque = 10;
        System.out.println("Adição de " + quantidadeEstoque + " unidades do produto " + produtoEstoque.getNome() + " em estoque");
        loja.adicionarEstoque(produtoEstoque, quantidadeEstoque);
        
        System.out.println("Produtos disponíveis na loja:");
        loja.listarProdutos();
        
        System.out.println("Remoção do produto " + produto3.getNome() + " da loja");
        loja.removerProduto(produto3);
        
        System.out.println("Produtos disponíveis na loja:");
        loja.listarProdutos();

    }

}
