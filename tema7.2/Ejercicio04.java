/*
 *Joaquín Bello Jiménez 
 */


public class Ejercicio04 {
	
	public static void main (String args[])
    throws InterruptedException {
    
       //Crea las variables y el array.
    int columna  = 0;
    int fila     = 0;
    int sColumna = 0;   //Variable suma de columna
    int sFila    = 0;   //Variable suma de la fila
    int sTotal   = 0;   //Variable suma del total
    
    int[][] num = new int[4][5];

    
    System.out.println("Introduce números enteros en el array");
    
    //Generar los falores de forma aleatoria
    for(fila = 0; fila < 4; fila++){
      for(columna = 0; columna < 5; columna++){
      num[fila][columna] = (int)(Math.random() * 900) + 100;
     }
    }
    

    System.out.println("");

    for(fila = 0; fila < 4; fila++) {
      sFila = 0;  
      for(columna = 0; columna < 5; columna++) {
        System.out.printf("%7d   ", num[fila][columna]);
        sFila += num[fila][columna];
      }  
      System.out.printf("|%7d", sFila);
      System.out.println("");
    }
    
    
    for(columna = 0; columna < 5; columna++) {
      System.out.print("----------");
    }
    System.out.println("----------");

  
    for(columna = 0; columna < 5; columna++) {
      sColumna = 0;
      for(fila = 0; fila < 4; fila++) {
        sColumna += num[fila][columna];
      }

      sTotal += sColumna;
      System.out.printf("%7d   ", sColumna);
      Thread.sleep(650);
    }
    System.out.printf("|%7d   ", sTotal);
    System.out.print(" Total");    
 }
}

