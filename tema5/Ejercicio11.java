/*
 * Joaquin Bello Jiménez
 * 
 */


public class Ejercicio11 {
  
  public static void main(String[] args) {
    
    System.out.print("Inserta un número: ");
    int numero = Integer.parseInt(System.console().readLine());

    for (int i = numero; i < numero + 5; i++) {
      System.out.println((i)+"  "+(i * i)+"  "+( i * i * i));

    }
  }
}
