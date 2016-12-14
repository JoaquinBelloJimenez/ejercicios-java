/*
 *Joaquín Bello Jiménez 
 */


public class Ejercicio06 {
	
	public static void main (String args[]) {
    
    int[] numero = new int[15];
    
    System.out.println("Introduce 15 números y los reordenaré :-)");
    
    for (int cont= 0;cont <15; cont++){
      System.out.print("Introduce un número: ");
      
      numero[cont] = Integer.parseInt(System.console().readLine());
      }
    System.out.print("");
    for (int contB= 0;contB <15; contB++){
      System.out.println(numero[contB]);
    }
    int aux = numero[14];
    
    for (int contC= 14; contC >0; contC--){
      numero[contC] = numero[contC-1];
    }
    numero[0] = aux;
    
    for (int contD= 0;contD <15; contD++){
      System.out.println(numero[contD]);
    }
	}
}

