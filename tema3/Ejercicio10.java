/**
 *
 * @author Joaquin Bello
 */

public class Ejercicio10 {
  public static void main(String[] args) {

  System.out.println("|----------|");
  System.out.println("|De Mb a Kb|");
  System.out.println("|----------|");
      
  System.out.println("¿Cuántos Mb vas a convertir?");
  double mb = Double.parseDouble(System.console().readLine());
  System.out.println(mb + " Mb son " + (mb * 1024) + " Kb");
  }
}
