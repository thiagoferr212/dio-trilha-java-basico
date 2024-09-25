package list.Ordenacao.ordenacaoDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    
    private List<Numero> listaNumeros;

    public OrdenacaoNumeros(){
        this.listaNumeros = new ArrayList<>();
    }

    public List<Numero> getListaNumeros() {
        return listaNumeros;
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(new Numero (numero));
    }

    public List<Numero> ordenarAscendente(){
        List<Numero> numerosOrdemAscendente = new ArrayList<>(listaNumeros);
        Collections.sort(numerosOrdemAscendente);
        return numerosOrdemAscendente;
    }

    public List<Numero> ordenarDescendente(){
        List<Numero> numerosOrdemDescendente = new ArrayList<>(listaNumeros);
        Collections.sort(numerosOrdemDescendente, Collections.reverseOrder());
        return numerosOrdemDescendente;
    }

    public static void main(String[] args) {

        OrdenacaoNumeros listaDeNumeros = new OrdenacaoNumeros();

        listaDeNumeros.adicionarNumero(1);
        listaDeNumeros.adicionarNumero(5);
        listaDeNumeros.adicionarNumero(2);
        listaDeNumeros.adicionarNumero(3);
        listaDeNumeros.adicionarNumero(4);
        
        System.out.println("Lista em ordem Ascendente: ");
        System.out.println(listaDeNumeros.ordenarAscendente());
        System.out.println("Lista em ordem Descendente: ");
        System.out.println(listaDeNumeros.ordenarDescendente());
    }
    
}
