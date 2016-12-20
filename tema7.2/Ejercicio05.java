/*
 *Joaquín Bello Jiménez 
 */


public class Ejercicio05 {
	
	public static void main (String args[]){
    
       //Crea las variables y el array.
    int columna  = 0;
    int fila     = 0;
    int minimo = 1000;
    int filaMin = 0;
    int columnaMinimo = 0;
    
    int maximo = 0;
    int filaMax = 0;
    int columnaMaximo = 0;
    
    int[][] num = new int[6][10];
    
    
    System.out.print("\n      ");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("   " + columna + "  ");
    }
    System.out.println();
    
    System.out.print("    ");
    for(columna = 0; columna < 9; columna++) {
      System.out.print(" ------");
    }
    System.out.println(" ");
    
    for(fila = 0; fila < 6; fila++) {
      System.out.print("  " + fila + " |");
      for(columna = 0; columna < 10; columna++) {
        num[fila][columna] = (int)(Math.random() * 1001);
        System.out.printf("%5d ", num[fila][columna]);
        
        // Comprobar el máximo
        if (num[fila][columna] > maximo) {
          maximo = num[fila][columna];
          filaMax = fila;
          columnaMaximo = columna;
        }
        //Comprobar el mínimo
        if (num[fila][columna] < minimo) {
          minimo = num[fila][columna];
          filaMin = fila;
          columnaMinimo = columna;
        }
        

      }
      System.out.println("|");
    }


    System.out.println("\n\nMáximo " + maximo +"  en la columna " + columnaMaximo + "  y la fila " + filaMax);
    System.out.println("Mínimo " + minimo  + " en la columna " + columnaMinimo + "  y la fila " + filaMin);
  }
}
