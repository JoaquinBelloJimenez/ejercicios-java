/**
 * Añade IVA a un precio base
 *
 * @author Joaquin Bello
 */

public class ejercicio06 {
  public static void main(String[] args) {

//Declarar las variables
    double base = 2480;
    double iva = 21;
//Realizar los cálculos
    System.out.println("Precio base " + base);
    System.out.println("IVA " + (iva / 100 * base));
    System.out.println("Precio con IVA " + (iva / 100 * base + base));
  }
}
