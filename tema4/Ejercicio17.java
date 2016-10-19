/**
 * Joaquín Bello Jiménez
 */
public class Ejercicio17 {

  public static void main(String[] args) {
    
     System.out.println("Te dré la  cifra de un número entero: ");
     int numero = Integer.parseInt(System.console().readLine());
    
     System.out.println("La última cifra del número introducido es el " + (numero % 10));
     
  }
}
