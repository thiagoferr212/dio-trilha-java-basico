package set.Ordenacao.listaDeAlunos;

import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    Set<Aluno> listaAlunosSet;

    public GerenciadorAlunos() {
        this.listaAlunosSet = new TreeSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double nota){
        listaAlunosSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula){
        Aluno alunoRemovido = null;
        for(Aluno a : listaAlunosSet){
            if(a.getMatricula() == matricula){
                alunoRemovido = a;
            }
        }
        listaAlunosSet.remove(alunoRemovido);
    }

    public Set<Aluno> exibirAlunoPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(listaAlunosSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new CompararPorNota());
        alunosPorNota.addAll(listaAlunosSet);
        return alunosPorNota;
    }

}
