/*
 * Joaquin Bello Jiménez
 * 
 */


public class Ejercicio12 {
  
  public static void main(String[] args) {
    
    System.out.println("Introduce la cantidad de números que quieres que se muestren:");
    
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println("-------------------------------------------------------------");
    int valA = 0;
    int valB = 1;
    int aux = 0;
    
    if (numero > 0){
     System.out.println("0");
     }
    else if (numero > 1){
     System.out.println("0");
     }
         
    for (int i = 0; i < numero; i ++)
    {
      aux = valA;
      valA = valB;
      valB = valA + aux;
      System.out.println(valB);
      
    }
    
    
    
  }
}
