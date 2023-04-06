/*      Crie um programa Java para gerenciar uma loja de produtos utilizando classes, objetos,
        métodos e atributos. O objetivo é criar um sistema que permita cadastrar produtos, exibir os
        produtos disponíveis, realizar vendas e gerenciar o estoque. Nesta versão simplificada, não
        usaremos Scanner e ArrayLists.   */

/*        1. Crie uma classe chamada "Produto" com os seguintes atributos e métodos:
        • Atributos:
        • nome (String)
        • preco (double)
        • quantidade (int)
        • Métodos:
        • Getters e Setters */
public class Produto {
    String nome;
    double preco;
    int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}