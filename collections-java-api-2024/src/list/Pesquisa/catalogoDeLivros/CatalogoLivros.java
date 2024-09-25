package list.Pesquisa.catalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> catalogoDeLivros;

    public CatalogoLivros(){
        this.catalogoDeLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        catalogoDeLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor (String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!catalogoDeLivros.isEmpty()){
            for(Livro l : catalogoDeLivros){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        if(!catalogoDeLivros.isEmpty()){
            for(Livro l : catalogoDeLivros){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervalo.add(l);
                }
            }
        }
        return livrosPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro titulosDeLivros = null;
        if(!catalogoDeLivros.isEmpty()){
            for(Livro l : catalogoDeLivros){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    titulosDeLivros = l;
                    break;
                }
            }
        }
        return titulosDeLivros;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogo.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogo.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogo.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogo.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalogo.pesquisarPorAutor("Autor 2"));
        System.out.println("");
        System.out.println(catalogo.pesquisarPorIntervaloAnos(2020,2022));
        System.out.println("");
        System.out.println(catalogo.pesquisarPorTitulo("Livro 1"));
    }

}
