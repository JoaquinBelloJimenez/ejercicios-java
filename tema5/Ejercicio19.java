/*
 * Joaquin Bello Jiménez
 *
 */


public class Ejercicio19 {

  public static void main(String[] args) {

    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int altura = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = System.console().readLine();

    int cnA = 1;
    int i = 0;
    int espacios = altura-1;

    while (cnA <= altura) {

      // inserta espacios
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      // pinta la línea
      for (i = 1; i < cnA * 2; i++) {
        System.out.print(relleno);
      }

      System.out.println();

      cnA++;
      espacios--;
    }
  }
}
