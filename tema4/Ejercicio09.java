/*
 * Joaquín Bello Jiménez
 */
public class Ejercicio09 {
  
  public static void main(String[] args) {
    double x1;
    double x2;
    
    System.out.print("Valor de a = ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Valor de b = ");
    double b = Double.parseDouble(System.console().readLine());
    
    System.out.print("Valor de c = ");
    double c = Double.parseDouble(System.console().readLine());
    
    
    if ((a == 0) && (b == 0) && (c == 0)) {
    	System.out.println("Resultados infinitos");
    }
  }
}
