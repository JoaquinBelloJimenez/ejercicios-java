/*
 *Joaquín Bello Jiménez 
 */


public class Ejercicio04B {
	
	public static void main (String args[]) {
    
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    long[] cubo = new long[20];
    
    System.out.println("numero  |cuadrado  |cubo");
    
    for (int mena = 0;mena <20; mena++){
      numero[mena] = (int)(Math.random()*101); //Calcula el string de numero
      cuadrado[mena] = (numero[mena]*numero[mena]); //Calcula el string de cuadrado
      cubo[mena] = (long)(cuadrado[mena]*numero[mena]);//Stringg de cubo
      System.out.printf("%1d %8d %8d", numero[mena], cuadrado[mena], cubo[mena]);//muestra string de cubo
    System.out.println("");//Salto de linea
   }
	}
}

