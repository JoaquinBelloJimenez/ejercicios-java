/*
 *Joaquín Bello Jiménez 
 */


public class Ejercicio10 {
	
	public static void main (String args[]) {
    
    //Declaro los arrays
    int[] numero = new int[20];
    int[] par    = new int[20];
    int[] impar  = new int[20];
    
    //Bucle para asignar los valores
    for (int i = 0; i < 8; i++) {
      numero[i] = (int)Math.random()+101;
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
