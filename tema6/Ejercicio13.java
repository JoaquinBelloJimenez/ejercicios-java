/*
 *Joaquín Bello Jiménez
 */


public class Ejercicio13 {

	public static void main (String args[])
   throws InterruptedException {  
    int dadoA = 0;
    int dadoB = 0;
    boolean iguales = false;
    int tirada = 1;
    
    System.out.println("2 dados");
    System.out.println();
    
    
    do{
      dadoA = (int)((Math.random()*6) + 1);
      dadoB = (int)((Math.random()*6) + 1);
      System.out.println("\nTirada número " + tirada);
      System.out.println("DadoA: " + dadoA + " DadoB: " + dadoB);
      if (dadoA == dadoB){
       iguales = true;
       System.out.println("Los dados han sacado el mismo número");
      }else{
      Thread.sleep(800);
      tirada++;
      }
      }while (!iguales);

    System.out.println();
  }
}
