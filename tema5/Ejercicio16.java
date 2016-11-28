/*
 * Joaquin Bello Jiménez
 *
 */


public class Ejercicio16 {

  public static void main(String[] args) {
    
    System.out.println("Introduce un número y diré si es primo");
    int numero = Integer.parseInt(System.console().readLine());
    boolean primo = true;
    
    for (int i = 2; i < numero; i++) {
      if ((numero % i) == 0) {
        primo = false;
      }
    }
        
    if (primo) {
      System.out.println("El número es primo.");
    } else {
      System.out.println("El número no es primo.");
}
    
  }
}
