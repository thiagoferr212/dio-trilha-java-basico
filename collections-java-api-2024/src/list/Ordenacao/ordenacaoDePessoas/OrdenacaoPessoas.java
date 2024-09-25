package list.Ordenacao.ordenacaoDePessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    
    private List<Pessoa> listaDePessoas;

    public OrdenacaoPessoas(){
        this.listaDePessoas = new ArrayList<>();
    }

    public void adicionarPessoas(String nome, int idade, double altura){
        listaDePessoas.add(new Pessoa(nome,idade,altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaDePessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(listaDePessoas);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas listaDePessoas = new OrdenacaoPessoas();

        listaDePessoas.adicionarPessoas("Thiago", 23, 1.70);
        listaDePessoas.adicionarPessoas("João", 20, 1.80);
        listaDePessoas.adicionarPessoas("Maria", 21, 1.50);

        System.out.println("Ordenar Pessoas por Idade: ");
        System.out.println(listaDePessoas.ordenarPorIdade());
        System.out.println("Ordenar Pessoas por Altura: ");
        System.out.println(listaDePessoas.ordenarPorAltura());
        
    }

}
