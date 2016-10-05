/**
 *
 * @author Joaquin Bello
 */

public class Ejercicio09 {
  public static void main(String[] args) {
		
	double pi = 3.1416;

  System.out.println("|---------------|");
  System.out.println("|Volumen de cono|");
  System.out.println("|---------------|");
      
  System.out.println("Altura del cono (cm)");
  double altura = Double.parseDouble(System.console().readLine());
  System.out.println("Radio del cono  (cm)");
  double radio = Double.parseDouble(System.console().readLine());
  double volumen = pi * radio * radio * altura /3;
  System.out.println("El volumen es de " + volumen + " cm3");
  }
}
