/*
 *Joaquín Bello Jiménez
 */


public class Ejercicio06 {

	public static void main (String args[]) {
    
    int numero = (int)(Math.random()*100)+0;
    int nIntroducido;
    
    System.out.println("Estoy pensando en un número");
    System.out.println(" ");
    //Primera vez en preguntar, para así obtener el valor de nIntroducido.
     System.out.println("---------------------------------");
     System.out.println("Tienes 5 intentos para adivinarlo");
     System.out.print("Introduce un número: ");
     nIntroducido= Integer.parseInt(System.console().readLine());
    
    
    for (int i = 4; i > 0;i--){
      //Separa el intento anterior y dice si tu número es mayor o menor.
      if (nIntroducido != numero){
       if (nIntroducido < numero){
        System.out.println("Tu número es menor");
       }else{
        System.out.println("Tu número es mayor");
       }
       //Vuelve a preguntar el valor del número.
       System.out.println("---------------------------------");
       System.out.println("Tienes " + i + " intentos para adivinarlo");
       System.out.print("Introduce un número: ");
       nIntroducido= Integer.parseInt(System.console().readLine());
      }else{}    
    }
    
    if (nIntroducido != numero){
      System.out.print("Has fracasado");
    }else{
      System.out.print("Has ganado");
    }  
 }
}
