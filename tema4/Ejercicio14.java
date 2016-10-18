/**
 * Joaquín Bello Jiménez
 */
public class Ejercicio14 {

  public static void main(String[] args) {
    System.out.print("Introduce un número entero: ");
    int x = Integer.parseInt(System.console().readLine());

    if ((x % 2) == 0) {
      System.out.print("El número es par.");
    } else {
      System.out.print("El número es impar.");
    }

    if ((x % 5) == 0) {
      System.out.println(" Puede dividerse entre 5.");
    } else {
      System.out.println(" No puede es divisible entre 5.");
    }
  }
}
