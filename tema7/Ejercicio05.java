/*
 *Joaquín Bello Jiménez 
 */


public class Ejercicio05 {
	
	public static void main (String args[]) {
    
    int[] numero = new int[10];
    int max = 0;
    int min = 100;
    
    System.out.println("Introduce números enteros y pulsa enter");
    
    for (int cont= 0;cont <10; cont++){
      System.out.println("Número: " + (cont + 1));
      
      numero[cont] = Integer.parseInt(System.console().readLine());
      if (numero[cont] > max){
          max = numero[cont];
      }
      if (numero[cont] < min){
        min = numero[cont];
      }
    }
    System.out.println("Número máximo: " + max);
    System.out.println("Número mínimo: " + min);
	}
}

