/*
 *Joaquín Bello Jiménez
 */


public class Ejercicio12 {

  public static void main(String[] args) 
    throws InterruptedException {

    int linea = 0;
    
    for(int i = 0; i < 3000; i++) {
      System.out.print((char)(Math.random() * (95) + 32));
      
      if (linea++ == 64) {
        linea = 0;
        Thread.sleep(60);
        System.out.println();
      }
    }
  }
}
