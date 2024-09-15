package loja;

import aparelho.Iphone;

public class Usuario {
    public static void main(String[] args) {
        
        Iphone ip = new Iphone();

        System.out.println("--APARELHO TELEFONICO--");
        ip.ligar("123456789");;
        ip.atender();
        ip.iniciarCorreioVoz();
        System.out.println("");
        
        System.out.println("--REPRODUTOR MUSICAL--");
        ip.selecionarMusica("Pagode");
        ip.tocar();
        ip.pausar();
        System.out.println("");
        
        System.out.println("--NAVEGADOR INTERNET--");
        ip.exibirPagina("https://dio.com");;
        ip.adicionarNovaAba();
        ip.atualizarPagina();
        System.out.println("");

    }
    
}
