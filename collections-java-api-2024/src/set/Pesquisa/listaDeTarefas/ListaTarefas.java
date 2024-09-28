package set.Pesquisa.listaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    
    private Set<Tarefa> listaDeTarefasSet;

    public ListaTarefas(){
        this.listaDeTarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        listaDeTarefasSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaRemovida = null;
        for(Tarefa t : listaDeTarefasSet){
            if(t.getDescricao().equals(descricao)){
                tarefaRemovida = t;
            }
        }
        listaDeTarefasSet.remove(tarefaRemovida);
    }

    public void exibirTarefas(){
         System.out.println(listaDeTarefasSet);
    }

    public int contarTarefas(){
        return listaDeTarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> listaTarefasConcluidas = new HashSet<>();
        for(Tarefa f : listaDeTarefasSet){
            if(f.isTarefaConcluida() == true){
                listaTarefasConcluidas.add(f);
            }
        }
        return listaTarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> listaTarefasPendentes = new HashSet<>();
        for(Tarefa f : listaDeTarefasSet){
            if(f.isTarefaConcluida() == false){
                listaTarefasPendentes.add(f);
            }
        }
        return listaTarefasPendentes;
    }

    public Tarefa marcarTarefaConcluida(String descricao){
        Tarefa tarefaconcluida = null;
        for(Tarefa f : listaDeTarefasSet){
            if(f.getDescricao().equalsIgnoreCase(descricao)){
                f.setTarefaConcluida(true);
                tarefaconcluida = f;
            }
        }
        return tarefaconcluida;
    }

    public Tarefa marcarTarefaPendente(String descricao){
        Tarefa tarefaPendente = null;
        for(Tarefa f : listaDeTarefasSet){
            if(f.getDescricao().equalsIgnoreCase(descricao)){
                f.setTarefaConcluida(false);
                tarefaPendente = f;
            }
        }
        return tarefaPendente;
    }

    public void limparListaTarefas(){
        listaDeTarefasSet.removeAll(listaDeTarefasSet);
    }

    public static void main(String[] args) {
        
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 3");

        System.out.println("Exibindo a lista de tarefas e a quantidade de tarefas:");
        listaTarefas.exibirTarefas();
        System.out.println(listaTarefas.contarTarefas());
        System.out.println("");
        System.out.println("Exibindo as tarefas concluídas:");
        listaTarefas.marcarTarefaConcluida("Tarefa 1");
        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println("");
        System.out.println("Exibindo as tarefas pendentes:");
        System.out.println(listaTarefas.obterTarefasPendentes());
        System.out.println("");
        listaTarefas.limparListaTarefas();
        System.out.println("Exibindo a lista de tarefas após ser limpa:");
        listaTarefas.exibirTarefas();

    }
    
}
