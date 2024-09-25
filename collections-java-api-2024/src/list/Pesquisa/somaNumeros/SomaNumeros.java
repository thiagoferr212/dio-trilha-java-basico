package list.Pesquisa.somaNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numerosinteiros;

    public SomaNumeros(){
        this.numerosinteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosinteiros.add(numero);
    }

    public int caulcularSoma(){
        int soma = 0;
        for(int n : numerosinteiros){
            soma += n;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        Collections.sort(numerosinteiros, Collections.reverseOrder());
        int maiornumero = numerosinteiros.get(0);
        return maiornumero;
    }
    
    public int encontrarMenorNumero(){
        Collections.sort(numerosinteiros);
        int menorNumero = numerosinteiros.get(0);
        return menorNumero;
    }

    public void exibirNumeros(){
        System.out.println(numerosinteiros.toString());
    }

    @Override
    public String toString() {
        return "SomaNumeros [numerosinteiros=" + numerosinteiros + "]";
    }

    public static void main(String[] args) {

        SomaNumeros listaDeNumerosInteiros = new SomaNumeros();
        
        System.out.println("Adicionando numeros: ");
        listaDeNumerosInteiros.adicionarNumero(5);
        listaDeNumerosInteiros.adicionarNumero(3);
        listaDeNumerosInteiros.adicionarNumero(1);
        listaDeNumerosInteiros.adicionarNumero(4);
        listaDeNumerosInteiros.adicionarNumero(2);
        listaDeNumerosInteiros.exibirNumeros();
        System.out.println("");
        System.out.println("Maior numero: " + listaDeNumerosInteiros.encontrarMaiorNumero());
        System.out.println("Menor numero: " + listaDeNumerosInteiros.encontrarMenorNumero());
        System.out.println("");
        listaDeNumerosInteiros.exibirNumeros();
        System.out.println("");
        System.out.println("Soma = " + listaDeNumerosInteiros.caulcularSoma());

    }
}
