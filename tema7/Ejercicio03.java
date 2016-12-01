/*
 *Joaquín Bello Jiménez 
 */


public class Ejercicio03 {
	
	public static void main (String args[]) {
    
    int[] numeros = new int[10];
    
          
    for(int i=0;i < 10;i++){
      System.out.print("Inserta un número: ");
      numeros[i] = Integer.parseInt(System.console().readLine());
    }
    for(int i=9;i > -1;i--){
    System.out.println("Número["+i+"]"+numeros[i]);
    }
    
	}
}

