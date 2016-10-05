/**
 *
 * @author Joaquin Bello
 */

public class Ejercicio12 {
  public static void main(String[] args) {
		
  System.out.println("|------------|");
  System.out.println("|Media examen|");
  System.out.println("|------------|");
      
  System.out.print("Nota del primer examen: ");
  double examen = Double.parseDouble(System.console().readLine());
  System.out.print("Nota deseada para el trimestre: ");
  double nfinal = Double.parseDouble(System.console().readLine());
  
  double examen2 = ((nfinal * 100) - (examen * 40))/60;
  System.out.println("Necesitas sacar un: " + examen2);
  
  }
}
