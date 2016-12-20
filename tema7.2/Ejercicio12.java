/*
 *Joaquín Bello Jiménez 
 */


public class Ejercicio12 {
	public static void main (String args[]){
    
    int contA = 0;
    int contB = 0;
    int maximo = 500;
    int minimo = 900;
    int total = 0;
    int[][] n = new int[9][9];
 
      for(contA = 0; contA < 9; contA++) {
      for(contB = 0; contB < 9; contB++) {
        n[contA][contB] = (int)(Math.random()*401) + 500;
        System.out.printf("%5d", n[contA][contB]);
        }
      System.out.println();
    }


    System.out.print("\nDiagonal desde la esquina superior izquierda ");
    System.out.println("a la esquina inferior derecha: ");
    

    
    for(int i = 0; i < 9; i++) {
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
