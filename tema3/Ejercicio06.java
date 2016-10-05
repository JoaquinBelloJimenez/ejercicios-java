/**
 * Área de rectángulo
 *
 * @author Joaquin Bello
 */

public class Ejercicio06 {
  public static void main(String[] args) {


  System.out.println("|---------------------|");
  System.out.println("|Área de un triángulo|");
  System.out.println("|---------------------|");
      
  System.out.print("Longitud de la base (cm): ");
  double base = Double.parseDouble(System.console().readLine());
  System.out.print("Longitud de altura  (cm): ");
  double altura = Double.parseDouble(System.console().readLine());
  System.out.println("El área de tu triángulo es: " + (base * altura)/2 + " cm2");
  }
}
