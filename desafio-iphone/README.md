# Desafio DIO Componentes iPhone

## Autores
- [Thiago Ferreira](https://github.com/thiagoferr212)

## Objetivos do Desafio

### - Criar um diagrama UML que represente as funcionalidades descritas abaixo.
1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### - Implementar as classes e interfaces correspondentes em Java.

## Diagrama UML(Mermaid)
````mermaid
classDiagram
  class ReprodutorMusical{
    <<interface>>
    + selecionarMusica(String musica)
    + tocar()
    + pausar()
  }

  class AparelhoTelefonico{
    <<interface>>
    + ligar(String numero)
    + atender()
    + iniciarCorreioVoz()
  }

  class NavegadorInternet{
    <<interface>>
    + exibirPagina(String url)
    + adicionarNovaAba()
    + atualizarPagina()
  }

  class iPhone{
    - verificarConexao()
    - verificarSinal()
  }

  iPhone --> ReprodutorMusical
  iPhone --> AparelhoTelefonico
  iPhone --> NavegadorInternet
```

