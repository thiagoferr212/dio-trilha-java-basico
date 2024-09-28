package set.Ordenacao.cadastroDeProdutos;

import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> listaDeProdutosSet;

    public CadastroProdutos(){
        this.listaDeProdutosSet = new TreeSet<>();
    }

    public void adicionarProdutos(long cod, String nome, double preco, int quantidade){
        listaDeProdutosSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(listaDeProdutosSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new CompararPorPreco());
        produtoPorPreco.addAll(listaDeProdutosSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        
        CadastroProdutos listaDeProdutos = new CadastroProdutos();

        listaDeProdutos.adicionarProdutos(1, "banana", 5.90, 3);
        listaDeProdutos.adicionarProdutos(2, "tomate", 4.00, 5);
        listaDeProdutos.adicionarProdutos(3, "batata", 3.25, 4);

        System.out.println("Exibindo produtos por nome: ");
        System.out.println(listaDeProdutos.exibirProdutosPorNome());
        System.out.println("Exibindo produtos por preço: ");
        System.out.println(listaDeProdutos.exibirProdutoPorPreco());
    }
}
