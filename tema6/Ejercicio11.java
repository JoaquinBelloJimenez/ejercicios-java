/*
 *Joaquín Bello Jiménez
 */


public class Ejercicio11 {

	public static void main (String args[]) {
    
    int nNota = 0;
    String nota = "A";
    int suspenso = 0;
    int suficiente = 0; 
    int bien = 0;
    int notable = 0;
    int sobre = 0; 
    
    System.out.println("Cuenta notas");
    System.out.println();
    
    
    for (int i = 0; i <20; i++){
      nNota = (int)((Math.random()*5) + 1);
      switch (nNota){
      case 1:
      nota = "Suspenso";
      suspenso ++;
      break;
      case 2:
      nota = "Suficiente";
      suficiente++;
      break;
      case 3:
      nota = "Bien";
      bien++;
      break;
      case 4:
      nota = "Notable";
      notable++;
      break;
      case 5:
      nota = "Sobresaliente";
      sobre++;
      break;
      }
      System.out.println(nota);
    }
    System.out.println();
    System.out.println("Suspensos = " + suspenso);
    System.out.println("Sficientes = " + suficiente);
    System.out.println("Bien = " + bien);
    System.out.println("Notables = " + notable);
    System.out.println("Sobresalientes = " + sobre);
  }
}
