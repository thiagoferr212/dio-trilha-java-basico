package construtores;

public class SistemaCadastro {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Thiago", "123456789");
        pessoa1.setEndereco("abc");

        System.out.println("O " + pessoa1.getNome() + " com CPF: " + pessoa1.getCpf() + " mora em " + pessoa1.getEndereco());

    } 
}
