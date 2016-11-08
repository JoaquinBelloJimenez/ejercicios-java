/*
 * Joaquin Bello Jiménez
 * 
 */


public class Ejercicio08 {
  
  public static void main(String[] args) {
    
    System.out.print("Tablas de multiplicar, introduce un número: ");
    int numero = Integer.parseInt(System.console().readLine());
        
    for (int c = 0; c <= 10; c++) {
      System.out.println(numero + " x " + c + " = " + numero * c);
    }

  }
}
