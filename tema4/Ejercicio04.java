/*
 * Joaquin Bello
 */

public class Ejercicio04 {
  
  public static void main (String args[]) {
		
		int salario;
    
    System.out.print("Horas trabajadas durante la semana: ");
    int horas = Integer.parseInt(System.console().readLine());
    
    if (horas <= 40 ){
      System.out.print("Salario = " + (horas * 12));
    }else {
      System.out.print("Salario = " + ((horas - 40)*16 + 480) );
		}
  }
}

