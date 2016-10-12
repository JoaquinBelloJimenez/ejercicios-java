/*
 * Joaquín Bello Jiménez
 */
public class Ejercicio05 {
  
  public static void main (String args[]) {
    System.out.print("Introduce a: ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce b: ");
    double b = Double.parseDouble(System.console().readLine());
    
    if (a == 0 ){
      System.out.print("Error, no puede calcularse su ecuación");
    }else {
      System.out.print("x = " + (-b/a));
    }
  }
}
