/*
 * Joaquin Bello Jiménez
 * 
 */


public class Ejercicio13 {
  
  public static void main(String[] args) {
    
    int pos = 0;
    int neg = 0;
    
    for (int i = 10; i > 0; i --){
    System.out.println("Introduce un número:");
    int numero = Integer.parseInt(System.console().readLine());
    if (numero < 0){
      neg ++;
    } else {
      pos ++;
    }
  }
    System.out.println("Positivos: "+ pos +" Negativos: "+ neg);


  }
}
