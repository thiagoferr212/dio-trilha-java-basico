package map.Pesquisa.estoqueDeProdutosComPreco;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0.0;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() > maiorPreco){
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        Double menorPreco = Double.MAX_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() < menorPreco){
                    menorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorvalorEmEstoque = null;
        Double maiorValorEmEstoque = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() * p.getQuantidade() > maiorValorEmEstoque){
                    maiorValorEmEstoque = p.getPreco() * p.getQuantidade();
                    produtoMaiorvalorEmEstoque = p;
                }
            }
        }
        return produtoMaiorvalorEmEstoque;
    }
    
    public static void main(String[] args) {
        
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1L, "Batata", 5, 5.0);
        estoque.adicionarProduto(2L, "CocaCola", 1, 10.0);
        estoque.adicionarProduto(3L, "Alface", 3, 2.0);

        System.out.println("Exibindo Produtos: ");
        estoque.exibirProdutos();
        System.out.println("Produto mais barato:   " + estoque.obterProdutoMaisBarato());
        System.out.println("Produto mais caro:   " + estoque.obterProdutoMaisCaro());
        System.out.println("Valor total em estoque: R$ " + estoque.calcularValorTotalEstoque());
        System.out.println("Produto de maior valor no estoque: " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }

}
