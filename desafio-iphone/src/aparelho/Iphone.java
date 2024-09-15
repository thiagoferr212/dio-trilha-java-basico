package aparelho;

import aparelho.apps.AparelhoTelefonico;
import aparelho.apps.NavegadorInternet;
import aparelho.apps.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{


    private void verficarConexao(){
        System.out.println("VERIFICANDO A CONEXÃO COM A INTERNET...");
    }
    
    private void verificarSinal(){
        System.out.println("VERIFICANDO SE O TELEFONE POSSUI SINAL...");
    }

    public void atender() {
        System.out.println("ATENDENDO TELEFONE...");       
    }
    
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ...");  
    }
    
    public void ligar(String numero) {
        verificarSinal();
        System.out.println("LIGANDO PARA: " + numero);   
    }

    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA NO NAVEGADOR");       
    }

    public void atualizarPagina() {
        System.out.println("ATUALIZANDO A PAGINA...");        
    }

    public void exibirPagina(String url) {
        verficarConexao();
        System.out.println("EXIBINDO A PAGINA: " + url);       
    }

    public void pausar() {
        System.out.println("MUSICA PAUSDA");       
    }

    public void selecionarMusica(String musica) {
        System.out.println("MUSICA " +  musica + " SELECIONADA");     
    }

    public void tocar() {
        System.out.println("TOCANDO MUSICA...");    
    }

}
