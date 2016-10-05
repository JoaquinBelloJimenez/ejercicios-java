/**
 * Cambia de pesetas a euro preguntando
 *
 * @author Joaquin Bello
 */

public class Ejercicio03 {
  public static void main(String[] args) {

//Declarar las variables
    double euros = 166.386;
//Recoger datos
    System.out.println("Diga la cantidad en pesetas: ");
    double pesetas = Double.parseDouble(System.console().readLine());
//Realizar operaciones
    System.out.println(pesetas + " pesetas son " + (pesetas / euros) + " euros");
  }
}
