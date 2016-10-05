/**
 *
 * @author Joaquin Bello
 */

public class Ejercicio11 {
  public static void main(String[] args) {
		
  System.out.println("|----------|");
  System.out.println("|De Kb a Mb|");
  System.out.println("|----------|");
      
  System.out.println("¿Cuántos Kb vas a convertir?");
  double mb = Double.parseDouble(System.console().readLine());
  System.out.println(mb + " Kb son " + (mb / 1024) + " Mb");
  }
}
