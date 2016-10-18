/**
 * Joaquín Bello Jiménez
 */
public class Ejercicio13 {

  public static void main(String[] args) {
    
    int orden;
    
    System.out.print("Introduce el valor a: ");
    int a = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el valor b: ");
    int b = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el valor c: ");
    int c = Integer.parseInt(System.console().readLine());

    if (a < b) {
      orden = a;
      a = b;
      b = orden;
    }
    
    if (b < c) {
      orden = b;
      b = c;
      c = orden;
    }
    
    if (a < b) {
      orden = a;
      a = b;
      b = orden;
    }
        
    System.out.println("Aquí el orden de mayor a menor: " + a + ", " + b + " y " + c + "."); 
  }
}
