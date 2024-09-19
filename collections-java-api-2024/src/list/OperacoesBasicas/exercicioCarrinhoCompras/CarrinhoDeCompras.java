package list.OperacoesBasicas.exercicioCarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> carrinho = new ArrayList<>();

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensRemovidos = new ArrayList<>();
        for(Item i : carrinho){
            if(i.getNome().equals(nome)){
                itensRemovidos.add(i);
            }
        }
        carrinho.removeAll(itensRemovidos);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        double valorItens = 0;
        for(Item a : carrinho){
            valorItens = a.getPreco() * a.getQuantidade();
            valorTotal += valorItens;
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(carrinho.toString());
    }

    public static void main(String[] args) {
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        System.out.println("Adicionando itens no carrinho...");
        carrinho.adicionarItem("banana", 5.50, 4);
        carrinho.adicionarItem("maçã", 2.50, 3);
        System.out.println("");
        
        System.out.println("Exibindo itens do carrinho:");
        carrinho.exibirItens();
        System.out.println("");
        
        System.out.println("Exibindo valor total do carrinho:");
        System.out.println(carrinho.calcularValorTotal());
        System.out.println("");
        
        System.out.println("Removendo itens do carrinho...");
        carrinho.removerItem("maçã");
        System.out.println("");

        System.out.println("Exibindo itens do carrinho:");
        carrinho.exibirItens();
        System.out.println("");
        
        System.out.println("Exibindo valor total do carrinho:");
        System.out.println(carrinho.calcularValorTotal());
        System.out.println("");
        
    }
}
