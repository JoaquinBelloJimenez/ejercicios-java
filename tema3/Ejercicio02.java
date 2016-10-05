/**
 * Cambia de euro a pesetas preguntando
 *
 * @author Joaquin Bello
 */

public class Ejercicio02 {
  public static void main(String[] args) {

//Declarar las variables
    double pesetas = 166.386;
//Recoger datos
    System.out.println("Diga la cantidad en euros: ");
    double euros = Double.parseDouble(System.console().readLine());
//Realizar operaciones
    System.out.println(euros + " euros son " + (euros * pesetas) + " pesetas");
  }
}
