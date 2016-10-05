/**
 *
 * @author Joaquin Bello
 */

public class Ejercicio08 {
  public static void main(String[] args) {

  System.out.println("|---------------|");
  System.out.println("|Salario semanal|");
  System.out.println("|---------------|");
      
  System.out.println("Bienvenido");
  System.out.println("¿Cuántas horas trabajó esta semana?");
  int horas = Integer.parseInt(System.console().readLine());
  
  System.out.println("Esta semana su salario es de: " + horas*12 + " euros");
  System.out.println("¡Gracias por usar nuestros servicios de cálculo de salario!");

  }
}
