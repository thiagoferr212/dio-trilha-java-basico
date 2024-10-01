package map.OperacoesBasicas.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String palavraPesquisada =  null;
        if(!dicionarioMap.isEmpty()){
            palavraPesquisada = dicionarioMap.get(palavra);
        }
        return palavraPesquisada;
    }

    public static void main(String[] args) {
        
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("palavra 1", "descricao palavra 1...");
        dicionario.adicionarPalavra("palavra 2", "descricao palavra 2...");
        dicionario.adicionarPalavra("palavra 3", "descricao palavra 3...");

        dicionario.exibirPalavras();
        System.out.println("");
        dicionario.removerPalavra("palavra 1");
        System.out.println("");
        dicionario.exibirPalavras();
        System.out.println("");
        System.out.println(dicionario.pesquisarPorPalavra("palavra 2"));
    }

}
