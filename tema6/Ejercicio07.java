/*
 *Joaquín Bello Jiménez
 */


public class Ejercicio07 {

	public static void main (String args[]) {
    
    int numero;
    int columnas = 3;
    System.out.println("Quiniela del jugador loco");
    System.out.println();
    
    //For que pinta las filas
    for (int i = 1; i <= 15;i++){
      if (i < 10){
       System.out.print(i + ".  ");
      }else{
        System.out.print(i + ". ");
      }
      if (i == 15){
        columnas = 1;
      }
    
    
      //For que pinta las columnas
      for (int j = 0; j < columnas; j++){
       numero = (int)(Math.random()*3)+1;
       
       switch(numero){
       case 1:
        System.out.print("|1  ");
       break;
       case 2:
        System.out.print("|  2");
       break;
       case 3:
        System.out.print("| x ");
       break;
       }
      }
      System.out.println();
    }    
  }
}
