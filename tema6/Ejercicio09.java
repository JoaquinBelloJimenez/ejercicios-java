/*
 *Joaquín Bello Jiménez
 */


public class Ejercicio09 {

	public static void main (String args[]) {
    
    int numero = 0;
    int par = 1;
    int cantidad = 0;
    System.out.println("Pares hasta el 24");
    System.out.println();
    
    
      for (int i = 0; numero != 24; i++){
       numero = (int)(Math.random()*100);
       if (numero != 24 && numero != 0){
       par = numero % 2;
        if (par == 0){
         cantidad++;
         System.out.println(numero);
        }
       }
      }
      if (cantidad == 0){
        System.out.println("El primer número es 24");
        }else{
      System.out.println("Números mostrados: " + cantidad);
        }
      System.out.println("Fin del programa");
  }
}
