/*
 *Joaquín Bello Jiménez 
 */


public class Ejercicio04 {
	
	public static void main (String args[]) {
    
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    long[] cubo = new long[20];
    
    
    
    System.out.println("Array numero");
    for (int i = 0;i < 20; i++){
      numero[i] = (int)(Math.random()*101);
      System.out.print(numero[i]+" | ");
    }
    System.out.println(" ");
    System.out.println("Array cuadrado");
    for (int j = 0; j < 20;j++){
      cuadrado[j] = (numero[j]*numero[j]);
      System.out.print(cuadrado[j]+" | ");
    }
    System.out.println(" ");
    System.out.println("Array cubo");
    for (int k = 0; k < 20;k++){
      cubo[k] = (long)(cuadrado[k]*numero[k]);
      System.out.print(cubo[k]+" | ");
    }
    
	}
}

