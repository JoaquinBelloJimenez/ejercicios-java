/**
 * E01 - Suma de 2 números
 *
 * @author Joaquin Bello
 */

public class Ejercicio01 {
  public static void main(String[] args) {

    int x;
    int y;
    int z;
    String linea;

    System.out.println("Prepárate para esta peaso de multiplicación");
    
    System.out.println("Por favor, introduce un número: ");
    linea = System.console().readLine();
    x = Integer.parseInt( linea );

    System.out.println("Por favor, introduce otro número: ");
    linea = System.console().readLine();
    y = Integer.parseInt( linea );

    z = x*y;
    System.out.println("Resultado poderoso: " + z);
  }
}
