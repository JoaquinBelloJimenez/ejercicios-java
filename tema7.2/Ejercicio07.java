/*
 *Joaquín Bello Jiménez 
 */


public class Ejercicio07 {
	
  static final int VACIO = 0;
  static final int MINA = 1;
  static final int TESORO = 2;
  static final int INTENTO = 3;
  
	public static void main (String args[]){

    int[][] cuadrante = new int[5][4];

    int x;
    int y;
    
    // Crea el array
    for(x = 0; x < 4; x++) {
      for(y = 0; y < 3; y++) {
        cuadrante[x][y] = VACIO;
      }
    }
    
    // lugar donde estará la mina
    int minaX = (int)(Math.random()*4);
    int minaY = (int)(Math.random()*3);
    
    cuadrante[minaX][minaY] = MINA;
    
    // Donde se enceuntra el tesoro
    int tesoroX;
    int tesoroY;
    
    do {
      tesoroX = (int)(Math.random()*4);
      tesoroY = (int)(Math.random()*3);
    } while ((minaX == tesoroX) && (minaY == tesoroY));
    
    cuadrante[tesoroX][tesoroY] = TESORO;
    
    System.out.println("¡A por el tesoro oculto!");
    
    int oportunidades = 6;
    boolean salir = false;
    String c = "";
            
    do {
      // Muestra la cuadrícula
      for(y = 3; y >= 0; y--) {
        System.out.print(y + "|");  
        for(x = 0; x < 5; x++) {
          if (cuadrante[x][y] == INTENTO) {
            System.out.print("X ");
          } else { 
            System.out.print("  ");
          }
        }
        System.out.println();   
      }
      System.out.println("  ----------\n  0 1 2 3 4\n");
      
      // Pide las coordenadas  
      System.out.print("Valor de x: ");
      x = Integer.parseInt(System.console().readLine());
      System.out.print("Valor de y: ");
      y = Integer.parseInt(System.console().readLine());
      
      // Comrpobar los valores dados
      switch(cuadrante[x][y]) {
        case VACIO:
          cuadrante[x][y] = INTENTO;
          if ((Math.abs(x - minaX) < 2) && (Math.abs(y - minaY) < 2)) {
            System.out.println("Hay una mina cerca.");
          }
          break;
        case MINA:
          System.out.println("Fracaso absoluto.");
          salir = true;
          break;
        case TESORO:
          System.out.println("Bien hecho, el tesoro es tuyo."); 
          salir = true;  
      }
    } while (!salir);

    // Pinta la cuadriocula
    for(y = 3; y >= 0; y--) {
      System.out.print(y + " ");  
      for(x = 0; x < 5; x++) {
        switch(cuadrante[x][y]) {
          case VACIO:
            c = "  ";
            break;
          case MINA:
            c = "* ";
            break;
          case TESORO:
            c = "€ ";
            break;
          case INTENTO:
            c = "x ";
            break;            
        }
        System.out.print(c);
      }      
      System.out.println();    
    }
System.out.println("  ----------\n  0 1 2 3 4\n");
  
 }
}

