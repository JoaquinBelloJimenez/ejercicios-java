/**
 * Área de rectángulo
 *
 * @author Joaquin Bello
 */

public class Ejercicio07 {
  public static void main(String[] args) {

  double iva = 0.21;


  System.out.println("|----------------|");
  System.out.println("|Total de factura|");
  System.out.println("|----------------|");
      
  System.out.print("Introduce base imponible: ");
  double baseImponible = Double.parseDouble(System.console().readLine());
  
  System.out.println("IVA = " + baseImponible * iva);
  System.out.print("Precio total = " + (baseImponible * iva) + baseImponible);

  }
}
