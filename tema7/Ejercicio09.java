/*
 *Joaquín Bello Jiménez 
 */


public class Ejercicio09 {
	
	public static void main (String args[]) {
    
    //Declaro arrays y las variables
    int[] numero = new int[8];
    int[] par    = new int[8];
    int[] impar  = new int[8];
    
    //Bucle para pedir los valores
    System.out.println("Introduce 8 valores mayores a 0 y diré cuales son pares o no");
    for (int i = 0; i < 8; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
      //Comprueba si es par o no y lo asigna a su array
       if ((numero[i] % 2) == 0){
         par[i] = numero[i];
       }else{
         impar[i] = numero[i];
       }
    }
    //Mostrar pares
    System.out.println("PARES");
    for (int j = 0; j < 8;j++){
      if (par[j] > 0){
        System.out.print(par[j]+" ");
      }
    }
    //Mostrar impares del mismo modo
    System.out.println("\nIMPARES");
    for (int k = 0; k < 8;k++){
      if (impar[k] > 0){
        System.out.print(impar[k]+" ");
      }
     }
  }
}
