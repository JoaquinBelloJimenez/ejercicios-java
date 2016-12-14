/*
 *Joaquín Bello Jiménez 
 */


public class Ejercicio10 {
	
	public static void main (String args[]) {
    
    //Declaro los arrays
    int[] numero = new int[20];
    int[] par    = new int[20];
    int[] impar  = new int[20];
    int cuentaPar = 0;
    int cuentaImpar = 0;
    
    //Bucle para asignar los valores
    for (int i = 0; i < numero.length; i++) {
      numero[i] = (int)(Math.random() * 101);
      //Comprueba si es par o no y lo asigna a su array
       if ((numero[i] >= 2) && (numero[i] % 2 == 0)){
         par[cuentaPar] = numero[i];
         cuentaPar++;
       }else if (numero[i] % 2 != 0) {
         impar[cuentaImpar] = numero[i];
         cuentaImpar++;
       }
    }
    //Ordenar los pares primero
    for (int j = 0; j < numero.length;j++){
        if (par[j] != 0){
          numero[j] = par[j];
          System.out.print(numero[j] +" ");
        }
    }
    //Ordenar detrás los impares
    for (int k = 0; k < numero.length;k++){
       if (impar[k] != 0){
          numero[k] = impar[k];
          System.out.print(numero[k] +" ");
        }
      }
  }
}
