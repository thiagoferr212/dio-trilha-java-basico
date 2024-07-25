import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da Conta: ");
        int numero = scanner.nextInt();
        System.out.println("Digite o número da Agência: ");
        String agencia = scanner.nextLine();
        agencia = scanner.nextLine();
        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Digite o valor do saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar " + 
            "uma conta em nosso banco," + " sua agência é " + agencia + ", conta " + 
            numero + " e seu saldo " + saldo + " já está disponível para saque\".");
        
    }
}
