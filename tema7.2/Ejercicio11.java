/*
 *Joaquín Bello Jiménez 
 */


public class Ejercicio11 {
	public static void main (String args[]){
    
    int contA = 0;
    int contB = 0;
    int maximo = 200;
    int minimo = 300;
    int total = 0;
    int[][] n = new int[10][10];
 
      for(contA = 0; contA < 10; contA++) {
      for(contB = 0; contB < 10; contB++) {
        n[contA][contB] = (int)(Math.random()*101) + 200;
        System.out.printf("%5d", n[contA][contB]);
        }
      System.out.println();
    }


    System.out.print("\nDiagonal desde la esquina superior izquierda ");
    System.out.println("a la esquina inferior derecha: ");
    

    
    for(int i = 0; i < 10; i++) {
      int numero = n[i][i];
      System.out.print(numero + " ");
      if (numero > maximo) {
        maximo = numero;
      }
      if (numero < minimo) {
        minimo = numero;
      }
      total += numero;
    }
    
    System.out.println("\nMáximo: " + maximo);
    System.out.println("Mínimo: " + minimo);
    System.out.println("Media: " + ((double)total / 10));
  }
}
