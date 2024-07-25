import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobreNome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobreNome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }
    
}
