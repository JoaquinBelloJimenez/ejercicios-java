/*
 *Joaquín Bello Jiménez
 */


public class Ejercicio05 {

	public static void main (String args[]) {
    
    int maximo = 100;
    int minimo = 199;
    int suma = 0;

    for (int i = 0; i < 50;i++){
    int numero = (int)(Math.random()*100)+100;
    System.out.print(numero + " ");
    suma += numero;
    
    if (numero > maximo){
      maximo = numero;
    }else if (numero < minimo){
      minimo = numero;
    }    
  }
  
    System.out.println("\nNúmero máximo: "+ maximo);
    System.out.println("Número mínimo: "+ minimo );
    System.out.println("Media: "+ (suma/50) );
 }
}
