/*
 *Joaquín Bello Jiménez 
 */


public class Ejercicio10 {
  
  static final String JUGADOR = "•";
  static final String ORDENADOR = "X";
  
	public static void main (String args[]){
    
    
     String[][] tablero = new String[3][3];
    int contA;
    int contB;
    int movimientos = 0;
    boolean jugadorGana = false;
    boolean ordenadorGana = false;
    String nombreFila = "cba";
    String coordenadas;
    
    // inicializa el tablero
    for(contA = 0; contA < 3; contA++) {
      for(contB = 0; contB < 3; contB++) {
        tablero[contA][contB] = " ";
      }
    }
      

    // juego /////////////////////////////////////////////////
    do {
      
      // pinta el tablero
      System.out.println("  ░░░░░░░░░░░░░░░");
      for(contA = 0; contA < 3; contA++) {
        System.out.print(nombreFila.charAt(contA)+ " ░");
        for(contB = 0; contB < 3; contB++) {
          System.out.print("░ " + tablero[contA][contB] + " ");
          }
        System.out.println("░░");
        System.out.println("  ░░░░░░░░░░░░░░░");
      }
      System.out.println("     1   2   3\n");
      
      // pide las coordenadas
      System.out.print("Introduzca las coordenadas, por ejemplo b2: ");
      coordenadas = System.console().readLine();
      int fila = nombreFila.indexOf(coordenadas.charAt(0));
      int columna = coordenadas.charAt(1) - 1 - 48;
      tablero[fila][columna] = JUGADOR;
      movimientos++;
      
      // Ver si gana el jugador
      jugadorGana = (
        (tablero[0][0] == JUGADOR) && (tablero[0][1] == JUGADOR) && (tablero[0][2] == JUGADOR) ||
        (tablero[1][0] == JUGADOR) && (tablero[1][1] == JUGADOR) && (tablero[1][2] == JUGADOR) ||
        (tablero[2][0] == JUGADOR) && (tablero[2][1] == JUGADOR) && (tablero[2][2] == JUGADOR) ||
        (tablero[0][0] == JUGADOR) && (tablero[1][0] == JUGADOR) && (tablero[2][0] == JUGADOR) ||
        (tablero[0][1] == JUGADOR) && (tablero[1][1] == JUGADOR) && (tablero[2][1] == JUGADOR) ||
        (tablero[0][2] == JUGADOR) && (tablero[1][2] == JUGADOR) && (tablero[2][2] == JUGADOR) ||
        (tablero[0][0] == JUGADOR) && (tablero[1][1] == JUGADOR) && (tablero[2][2] == JUGADOR) ||
        (tablero[0][2] == JUGADOR) && (tablero[1][1] == JUGADOR) && (tablero[2][0] == JUGADOR)
      );
      
      if (!jugadorGana && (movimientos < 9)) {
          //El ordenador juega
        do {
          fila = (int)(Math.random() * 3);
          columna = (int)(Math.random() * 3);
        } while (!tablero[fila][columna].equals(" "));
        
        tablero[fila][columna] = ORDENADOR;
        movimientos++;

        //Ver si ha ganado el ordenador
        ordenadorGana = (
          (tablero[0][0] == ORDENADOR) && (tablero[0][1] == ORDENADOR) && (tablero[0][2] == ORDENADOR) ||
          (tablero[1][0] == ORDENADOR) && (tablero[1][1] == ORDENADOR) && (tablero[1][2] == ORDENADOR) ||
          (tablero[2][0] == ORDENADOR) && (tablero[2][1] == ORDENADOR) && (tablero[2][2] == ORDENADOR) ||
          (tablero[0][0] == ORDENADOR) && (tablero[1][0] == ORDENADOR) && (tablero[2][0] == ORDENADOR) ||
          (tablero[0][1] == ORDENADOR) && (tablero[1][1] == ORDENADOR) && (tablero[2][1] == ORDENADOR) ||
          (tablero[0][2] == ORDENADOR) && (tablero[1][2] == ORDENADOR) && (tablero[2][2] == ORDENADOR) ||
          (tablero[0][0] == ORDENADOR) && (tablero[1][1] == ORDENADOR) && (tablero[2][2] == ORDENADOR) ||
          (tablero[0][2] == ORDENADOR) && (tablero[1][1] == ORDENADOR) && (tablero[2][0] == ORDENADOR)
        );
      }  
      
    } while (!jugadorGana && !ordenadorGana && (movimientos < 9));
    
    
    System.out.println("  ░░░░░░░░░░░░░░░");
    for(contA = 0; contA < 3; contA++) {
      System.out.print(nombreFila.charAt(contA)+ " ░");
      for(contB = 0; contB < 3; contB++) {
        System.out.print("░ " + tablero[contA][contB] + " ");
        }
      System.out.println("░░");
      System.out.println("  ░░░░░░░░░░░░░░░");
    }
    System.out.println("     1   2   3\n");
    
    if (jugadorGana) {
      System.out.println("¡Enhorabuena! ¡Has ganado!");
    } else if (ordenadorGana) {
      System.out.println("Gana el ordenador.");
    } else {
      System.out.println("Empate. No gana nadie.");
    }
  }
}
