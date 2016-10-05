/**
 * Área de rectángulo
 *
 * @author Joaquin Bello
 */

public class Ejercicio05 {
  public static void main(String[] args) {


  System.out.println("|---------------------|");
  System.out.println("|Área de un rectángulo|");
  System.out.println("|---------------------|");
      
  System.out.print("Longitud de la base (cm): ");
  double base = Double.parseDouble(System.console().readLine());
  System.out.print("Longitud de altura  (cm): ");
  double altura = Double.parseDouble(System.console().readLine());
  System.out.println("El área de tu rectángulo es: " + (base * altura) + " cm2");
  }
}
