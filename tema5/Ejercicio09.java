/*
 * Joaquin Bello Jiménez
 * 
 */


public class Ejercicio09 {
  
  public static void main(String[] args) {
    
    int digitos = 1;
    int n, numero;

    System.out.print("Introduce un número entero, le diré los dígitos: ");
    numero = Integer.parseInt(System.console().readLine());
    
    n = numero;
    
    while (n > 10) {
      n /= 10;
      digitos++;
    }
    
    System.out.println("El número "+ numero + " tiene " + digitos + " dígito(s).");

  }
}
