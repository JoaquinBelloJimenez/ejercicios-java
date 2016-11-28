/*
 *Joaquín Bello Jiménez
 */


public class Ejercicio14 {

	public static void main (String args[]) {
    
    int minimo = 1;
    int maximo = 101;
    int tope = (maximo - minimo);
    int numero = (int)(Math.random()*100)+0;
    boolean acierto = false;
    String respuesta;
    
    System.out.println("Piensa en un número e intentaré adivinarlo");
    System.out.println(" ");
    //Primera vez en preguntar, para así obtener el valor de nIntroducido.
     System.out.println("---------------------------------");
    
    for (int i = 5; i > 0;i--){
      if (!acierto){ //Si no se ha acertado seguir intentándolo.
        System.out.println("Tengo " + i + " intento(s) para adivinarlo");
        tope = (maximo - minimo); //Calcular el nuevo rango de adivinanza
        numero = (int)(Math.random()*tope)+minimo; //Búmero aleatorio que prueba el pc.
        System.out.println("¿Es tu número " + numero + "? (si/no)");
        respuesta = System.console().readLine();
        if(respuesta.equals ("no")){
          System.out.println("¿Es tu número mayor o menor?");
          respuesta = System.console().readLine();
           if(respuesta.equals ("mayor")){
             minimo = numero +1;
           }else if (respuesta.equals ("menor")){
             maximo = numero -1;
           }
          System.out.println("---------------------------------");
        }else if (respuesta.equals("si")){
          acierto = true; //Si acierta salir del bucle.
          System.out.println("¡¡He acertado!! Gracias por jugar conmmigo :-)");
        }
      }
       
    }
 }
}
