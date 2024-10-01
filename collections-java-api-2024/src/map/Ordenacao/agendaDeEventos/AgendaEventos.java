package map.Ordenacao.agendaDeEventos;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> agendaEventosMap;

    public AgendaEventos() {
        this.agendaEventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agendaEventosMap.put(data, new Evento(nome, atracao));
    }   

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);
        for(Map.Entry<LocalDate,Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O Próximo evento: " + entry.getValue() + " acontecerá na data: " + entry.getKey());
                break;
            }
        }
    }

    
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2023, 6, 10), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 1), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 12, 2), "Evento 3", "Atração 3");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }

}
