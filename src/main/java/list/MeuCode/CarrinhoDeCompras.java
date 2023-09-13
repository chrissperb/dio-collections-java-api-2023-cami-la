package main.java.list.MeuCode;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    // Atributo
    private List <Item> meuCarrinho;

    public CarrinhoDeCompras() {
        this.meuCarrinho = new ArrayList<>();
    }

    public void adiciconarItem(String nome, double preco, int quantidade) {
        meuCarrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!meuCarrinho.isEmpty()) {
            for (Item i : meuCarrinho) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            meuCarrinho.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
            System.out.println("O item foi removido com sucesso!");
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!meuCarrinho.isEmpty()) {
            for (Item item : meuCarrinho) {
                double valorItem = item.getQuantidade() * item.getPreco();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens () {
        if (!meuCarrinho.isEmpty()) {
            System.out.println(this.meuCarrinho);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "meuCarrinho=" + meuCarrinho +
                '}';
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adiciconarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adiciconarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adiciconarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adiciconarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}

