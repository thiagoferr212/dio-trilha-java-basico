import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        
        double mesada = 50.0;
        int quantidadeDoce = 0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();

            if (valorDoce > mesada){
                valorDoce = mesada;
            }
            
            System.out.printf("Valor do doce: %.2f%n" , valorDoce);
            mesada = mesada - valorDoce;
            System.out.printf("mesada: %.2f%n" , mesada);
            quantidadeDoce++;
        }
        System.out.println("A quantidade de doces comprados foram: " + quantidadeDoce);

    }
    
    public static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,9);
    }
}
