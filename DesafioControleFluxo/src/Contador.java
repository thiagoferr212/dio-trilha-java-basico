import java.util.Scanner;
public class Contador {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o 1º Parametro: ");
        int parametro1 = sc.nextInt();

        System.out.println("Insira o 2º Parametro: ");
        int parametro2 = sc.nextInt();

        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
            e.printStackTrace();
        }
    }
    public static void contar(int parametro1, int parametro2)throws ParametrosInvalidosException{

        if(parametro1>parametro2){
            throw new ParametrosInvalidosException();
        }

        int contagem = parametro2 - parametro1;

        for(int i=0; i<contagem; i++){
            System.out.println("Imprimindo o número " + (i+1));
        }
    }
}
