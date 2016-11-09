/*
 * Joaquin Bello Jiménez
 * 
 */


public class Ejercicio14 {
  
  public static void main(String[] args) {
    
    int resultado = 1;
    
    System.out.println("Introduce una base(Entero positivo):");
    int base = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce un exponente(Entero positivo):");
    int exponente = Integer.parseInt(System.console().readLine());
    
    if(base > 0 && exponente > 0){
    
    for (int i = 0;i != exponente; i++){
      
      resultado = resultado * base;
      
    }
    System.out.println("El resultado es: " + resultado);
    }else{
     System.out.println("Números positivos, genio");
    }
  }
}
