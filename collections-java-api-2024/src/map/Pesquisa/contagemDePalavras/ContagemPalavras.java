package map.Pesquisa.contagemDePalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        contagemPalavrasMap.remove(palavra);
    }

    public void exibirContagemPalavras(){
        System.out.println(contagemPalavrasMap);
    }
    
    public String encontrarPalavraMaisFrequente(){
        String linguagemMaisFrequente = null;
        int maiorContagem = Integer.MIN_VALUE;
        for(Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()){
            if(entry.getValue() > maiorContagem){
                linguagemMaisFrequente = entry.getKey();
                maiorContagem = entry.getValue();
            }
        }
        return "A linguagem mais frequente é " + linguagemMaisFrequente + " e sua contagem é " + maiorContagem;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavra("Java", 2);
        contagemLinguagens.adicionarPalavra("Python", 8);
        contagemLinguagens.adicionarPalavra("JavaScript", 1);
        contagemLinguagens.adicionarPalavra("C#", 6);

        contagemLinguagens.exibirContagemPalavras();
        
        contagemLinguagens.removerPalavra("C#");
        
        contagemLinguagens.exibirContagemPalavras();

        System.out.println(contagemLinguagens.encontrarPalavraMaisFrequente());

    }
    
}
