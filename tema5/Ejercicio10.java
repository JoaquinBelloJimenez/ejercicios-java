/*
 * Joaquin Bello Jiménez
 * 
 */


public class Ejercicio10 {
  
  public static void main(String[] args) {
    
    double numeros = 0;
    double numeroIntroducido = 0;
    double suma = 0;

    System.out.println("Introduce números positivos para el cálculo.");
    System.out.println("Introduce un número negativo para salir:");

    while (numeroIntroducido >= 0) {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      numeros++;
      suma += numeroIntroducido;
    }
    
    System.out.println("Aquí está la media:  " + (suma - numeroIntroducido)/ (numeros - 1));

  }
}
