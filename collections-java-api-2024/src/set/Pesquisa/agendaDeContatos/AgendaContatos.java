package set.Pesquisa.agendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numeroContato){
        contatosSet.add(new Contato(nome, numeroContato));
    }

    public void exibirContatos(){
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> nomesPesquisados = new HashSet<>();
        for(Contato c : contatosSet){
            if(c.getNome().startsWith(nome)){
                nomesPesquisados.add(c);
            }
        }
        return nomesPesquisados;
    }

    public Contato atualizarNumeroContato(String nome, int numeroContato){
        Contato contatoAtualizado = null;
        for(Contato c : contatosSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numeroContato);
                contatoAtualizado = c;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos listaContatos = new AgendaContatos();

        listaContatos.adicionarContato("Thiago", 123456);
        listaContatos.adicionarContato("João", 654321);
        listaContatos.adicionarContato("Thiago Ferreira", 123123);

        listaContatos.exibirContatos();
        listaContatos.pesquisarPorNome("Thiago");
        listaContatos.atualizarNumeroContato("Thiago", 12345);
        listaContatos.exibirContatos();

    }
    
}
