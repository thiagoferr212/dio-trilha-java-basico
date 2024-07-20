public class SmartTv {
 
     boolean ligada = false;
     int canal = 1;
     int volume = 25;

     public void aumentarCanal(){
         canal++;
         System.out.println("Canal aumentado para: " + canal);
     }
     public void diminuirCanal(){
         canal--;
         System.out.println("Canal diminuido para: " + canal);
     }

     public void mudarCanal(int novoCanal){
         this.canal = novoCanal;
         System.out.println("Canal selecionado: " + canal);
     }
     public void ligar(){
         ligada = true;
     }
     public void desligar(){
         ligada = false;
     }
     public void aumentarVolume(){
         volume++;
         System.out.println("Aumentar volume para: " + volume);
     }
     public void diminuirVolume(){
         volume--;
         System.out.println("Diminuir volume para: " + volume);
     }
}