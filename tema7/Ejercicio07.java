/*
 *Joaquín Bello Jiménez 
 */


public class Ejercicio07 {
	
	public static void main (String args[]) {
    
    //Declaro el array y las variables
    int[] numero = new int[100];
    int valorA = 0;
    int valorB = 0;
    //Bucle para crear los valores del array
    System.out.println("Valores originales");
    for (int i = 0; i < 100; i++) {
      numero[i] = (int)((Math.random()*20));
      System.out.print(numero[i] + " ");
    }
    //Pide los valores por teclado
    System.out.println("\nIntroduce un número: ");
    valorA = Integer.parseInt(System.console().readLine());
      System.out.println("Cambiar por: ");
    valorB = Integer.parseInt(System.console().readLine());
    //Bucle para encontrar el valor y cambiarlo
    System.out.println("Valor editado");
    for (int j = 0; j < 100;j++) {
      if (numero[j] == valorA){
        numero[j] = valorB;
      }
      System.out.print(numero[j] + " ");
      
    }
	}
}

