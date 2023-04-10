public class Loja {
    
    
    private Produto produto1;
    private Produto produto2;
    private Produto produto3;
    
    public void adicionarProduto(Produto produto) {
        if (produto1 == null) {
            produto1 = produto;
        } else if (produto2 == null) {
            produto2 = produto;
        } else if (produto3 == null) {
            produto3 = produto;
        } else {
            System.out.println("Não foi possível adicionar o produto. A loja está cheia.");
        }
    }
    
    public void removerProduto(Produto produto) {
        if (produto1 == produto) {
            produto1 = null;
        } else if (produto2 == produto) {
            produto2 = null;
        } else if (produto3 == produto) {
            produto3 = null;
        } else {
            System.out.println("Produto não encontrado na loja.");
        }
    }
    
    public void listarProdutos() {
        if (produto1 != null) {
            System.out.println("Produto 1: " + produto1.getNome() + " - Preço: R$" + produto1.getPreco() + " - Quantidade: " + produto1.getQuantidade());
        }
        if (produto2 != null) {
            System.out.println("Produto 2: " + produto2.getNome() + " - Preço: R$" + produto2.getPreco() + " - Quantidade: " + produto2.getQuantidade());
        }
        if (produto3 != null) {
            System.out.println("Produto 3: " + produto3.getNome() + " - Preço: R$" + produto3.getPreco() + " - Quantidade: " + produto3.getQuantidade());
        }
    }
    
    public void venderProduto(Produto produto, int quantidade) {
        if (produto.getQuantidade() >= quantidade) {
            produto.setQuantidade(produto.getQuantidade() - quantidade);
            System.out.println("Venda realizada com sucesso. Total a pagar: R$" + (produto.getPreco() * quantidade));
        } else {
            System.out.println("Não há quantidade suficiente em estoque para realizar a venda.");
        }
    }
    
    public void adicionarEstoque(Produto produto, int quantidade) {
        produto.setQuantidade(produto.getQuantidade() + quantidade);
        System.out.println("Estoque do produto " + produto.getNome() + " atualizado para " + produto.getQuantidade() + " unidades.");
    }
}
