package set.OperacoesBasicas.conjuntoDeConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> conjuntoConvidadosSet = new HashSet<>();

    public ConjuntoConvidados(){
        this.conjuntoConvidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        conjuntoConvidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidado(int codigoConvite){
        Convidado convidadoRemovido = null;
        for(Convidado c : conjuntoConvidadosSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoRemovido = c;
                break;
            }
        }
        conjuntoConvidadosSet.remove(convidadoRemovido);
    }

    public int contarConvidados(){
        return conjuntoConvidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(conjuntoConvidadosSet);
    }

    public static void main(String[] args) {
        
        ConjuntoConvidados listaDeConvidados = new ConjuntoConvidados();

        listaDeConvidados.adicionarConvidado("Convidado 1", 12);
        listaDeConvidados.adicionarConvidado("Convidado 2", 123);
        listaDeConvidados.adicionarConvidado("Convidado 3", 123);
        listaDeConvidados.adicionarConvidado("Convidado 4", 1234);

        System.out.println("Quantidade de convidados: ");
        System.out.println(listaDeConvidados.contarConvidados());
        System.out.println("");
        listaDeConvidados.exibirConvidados();
        listaDeConvidados.removerConvidado(123);
        listaDeConvidados.exibirConvidados();

    }
}
