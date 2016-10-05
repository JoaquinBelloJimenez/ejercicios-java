/**
 * E04 - calculando cosas
 *
 * @author Joaquin Bello
 */

public class Ejercicio04 {
  public static void main(String[] args) {

  int x;
  int y;
  String linea;

  System.out.println("|-----------------------|");
  System.out.println("|Programa multi cálculos|");
  System.out.println("|-----------------------|");
    
  System.out.println("Por favor, introduce un número: ");
  linea = System.console().readLine();
  x = Integer.parseInt( linea );

  System.out.println("Por favor, introduce otro número: ");
  linea = System.console().readLine();
  y = Integer.parseInt( linea );

  System.out.println("Resultado de Suma: " + (x+y));
  System.out.println("Resultado de Resta: " + (x-y));
  System.out.println("Resultado de Multiplicación: " + (x*y));
  System.out.println("Resultado de División: " + (x/y));
  }
}
