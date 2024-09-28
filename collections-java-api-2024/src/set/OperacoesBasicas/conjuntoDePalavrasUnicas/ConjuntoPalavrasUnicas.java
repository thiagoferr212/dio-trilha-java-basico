package set.OperacoesBasicas.conjuntoDePalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<Palavra> conjuntoPalavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        conjuntoPalavrasSet.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra){
        Palavra palavraRemovida = null;
        for(Palavra p : conjuntoPalavrasSet){
            if (p.getPalavra().equals(palavra)) {
                palavraRemovida = p;
                break;
            }
        }
        conjuntoPalavrasSet.remove(palavraRemovida);
    }

    public void verificarPalavra(String palavra){
       Palavra palavraVerificada = new Palavra(palavra);
       if(conjuntoPalavrasSet.contains(palavraVerificada)){
            System.out.println("A palavra " + palavraVerificada + " existe no conjunto");
        }
        else{
           System.out.println("A palavra " + palavraVerificada + " não existe no conjunto");
       }
    }

    public Set<Palavra> exibiPalavrasUnicas(){
        return conjuntoPalavrasSet;
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();

        conjuntoPalavras.adicionarPalavra("abelha");
        conjuntoPalavras.adicionarPalavra("baleia");
        conjuntoPalavras.adicionarPalavra("abelha");
        conjuntoPalavras.adicionarPalavra("macaco");

        System.out.println(conjuntoPalavras.exibiPalavrasUnicas());
        conjuntoPalavras.verificarPalavra("baleia");
        conjuntoPalavras.removerPalavra("baleia");
        System.out.println(conjuntoPalavras.exibiPalavrasUnicas());
        conjuntoPalavras.verificarPalavra("baleia");
    }
    
}
