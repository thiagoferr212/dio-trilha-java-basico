package list.OperacoesBasicas.exercicioListaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> listaDeTarefas;

    public ListaTarefas() {
        this.listaDeTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> listaTarefasRemovidas = new ArrayList<>();
        for(Tarefa t : listaDeTarefas){
            if(t.getDescricao().equals(descricao)){
                listaTarefasRemovidas.add(t);
            }
        }
        listaDeTarefas.removeAll(listaTarefasRemovidas);
    }
    
    public int obterNumeroTotalTarefas(){
        return listaDeTarefas.size();
    }

    public void obterDescricoesTarefas(){
            System.out.println(listaDeTarefas.toString());
    }
    
    public static void main(String[] args) {
        ListaTarefas listaDeTarefas = new ListaTarefas();
        System.out.println(listaDeTarefas.obterNumeroTotalTarefas());
        listaDeTarefas.adicionarTarefa("Tarefa 1");
        listaDeTarefas.adicionarTarefa("Tarefa 2");
        listaDeTarefas.adicionarTarefa("Tarefa 3");
        System.out.println(listaDeTarefas.obterNumeroTotalTarefas());
        listaDeTarefas.removerTarefa("Tarefa 2");
        System.out.println(listaDeTarefas.obterNumeroTotalTarefas());
        listaDeTarefas.obterDescricoesTarefas();
    }

}
