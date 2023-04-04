/*Crie uma classe chamada "Loja" com os seguintes atributos e métodos:
        • Atributos:
        • produto1 (Produto)
        • produto2 (Produto)
        • produto3 (Produto)
        • Métodos:
        • adicionarProduto(Produto produto): atribui um produto a uma das
        variáveis produto1, produto2 ou produto3
        • removerProduto(Produto produto): remove um produto, atribuindo
        null a uma das variáveis produto1, produto2 ou produto3
        • listarProdutos(): exibe todos os produtos disponíveis na loja
        • venderProduto(Produto produto, int quantidade): realiza a venda de
        um produto, se a quantidade em estoque for suficiente
        • adicionarEstoque(Produto produto, int quantidade): adiciona estoque
        a um produto*/
public class Loja {

    Produto produto1;
    Produto produto2;
    Produto produto3;

    public void adicionarProduto(Produto produto){
        if (produto1 == null){
            produto1 = produto;
        } else if (produto2 == null) {
            produto2 = produto;
        } else if (produto3 == null) {
            produto3 = produto;
        }
    }

    public void removerProduto(Produto produto){
        if (produto1 != null && produto1.equals(produto)){
            produto1 = null;
        }else if (produto2 != null && produto2.equals(produto)){
            produto2 = null;
        } else if (produto3 != null && produto3.equals(produto)) {
            produto3 = null;
        }else {
            System.out.printf("O produto não esta disponivel na loja");
        }
    }

    public void listarProduto(){
        if (produto1 != null){
            System.out.printf("- " + produto1.getNome());
        }

        if (produto2 != null){
            System.out.printf("- " + produto2.getNome());
        }

        if (produto3 != null){
            System.out.printf("- " + produto3.getNome());
        }

    }

}
