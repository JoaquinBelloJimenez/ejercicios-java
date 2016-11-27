/*
 *Joaquín Bello Jiménez
 */


public class Ejercicio08 {

	public static void main (String args[]) {
    
    int numero;
    int columnas = 3;
    System.out.println("Quiniela del jugador loco2");
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
       numero = (int)(Math.random()*6)+1;
       
       if (numero <= 3){
         System.out.print("|1  ");
       }else if (numero <=5){
         System.out.print("| x ");
       }else {
         System.out.print("|  2");
         }
      }
      System.out.println();
    }    
  }
}
