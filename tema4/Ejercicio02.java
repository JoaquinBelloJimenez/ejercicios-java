/*
 * Joaquin Bello
 */

public class Ejercicio02 {
  
  public static void main (String args[]) {
    
    System.out.print("Introduzca una hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    if ((hora >= 6) && (hora <= 12)){
      System.out.print("Buenos días");
    }else if ((hora >= 13) && (hora <= 20)){
      System.out.print("Buenas tardes");
    }else if (((hora >= 21) && (hora <= 24)) || ((hora >= 0) && (hora < 6))){
			System.out.print("Buenas noches");
		}
  }
}

