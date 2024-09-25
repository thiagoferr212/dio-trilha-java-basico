package list.Ordenacao.ordenacaoDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    
    private List<Integer> listaNumeros;

    public OrdenacaoNumeros(){
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendentes = new ArrayList<>(listaNumeros);
        if(!listaNumeros.isEmpty()){
            Collections.sort(numerosAscendentes);
            return numerosAscendentes;
        }
        else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendente = new ArrayList<>(listaNumeros);
        if(!listaNumeros.isEmpty()){
            Collections.sort(numerosDescendente, Collections.reverseOrder());
            return numerosDescendente;
        }
        else{
            throw new RuntimeException("A lista está vazia");
        }
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

    
