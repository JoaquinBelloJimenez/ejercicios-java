/**
 * Joaquín Bello Jiménez
 */
public class Ejercicio16 {

  public static void main(String[] args) {

    String respuesta;
    int puntos = 0;
    
     System.out.println("¿Es tu pareja infiel? Test de la verdad:");
     
     System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
     System.out.println("(V)Verdadero / (F)Falso");
     respuesta = System.console().readLine().toUpperCase();
     if (respuesta.equals("V")) {
     puntos = puntos+3;
     }
     
     System.out.println("2. Ha aumentado sus gastos de vestuario");
     System.out.println("(V)Verdadero / (F)Falso");
     respuesta = System.console().readLine().toUpperCase();
     if (respuesta.equals("V")) {
     puntos = puntos+3;
     }
     
     System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
     System.out.println("(V)Verdadero / (F)Falso");
     respuesta = System.console().readLine().toUpperCase();
     if (respuesta.equals("V")) {
     puntos = puntos+3;
     }
     
     System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
     System.out.println("(V)Verdadero / (F)Falso");
     respuesta = System.console().readLine().toUpperCase();
     if (respuesta.equals("V")) {
     puntos = puntos+3;
     }
  
     System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
     System.out.println("(V)Verdadero / (F)Falso");
     respuesta = System.console().readLine().toUpperCase();
     if (respuesta.equals("V")) {
     puntos = puntos+3;
     }
     
     System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
     System.out.println("(V)Verdadero / (F)Falso");
     respuesta = System.console().readLine().toUpperCase();
     if (respuesta.equals("V")) {
     puntos = puntos+3;
     } 
     
     System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
     System.out.println("(V)Verdadero / (F)Falso");
     respuesta = System.console().readLine().toUpperCase();
     if (respuesta.equals("V")) {
     puntos = puntos+3;
     }   
     
     System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
     System.out.println("(V)Verdadero / (F)Falso");
     respuesta = System.console().readLine().toUpperCase();
     if (respuesta.equals("V")) {
     puntos = puntos+3;
     }
     
     System.out.println("9. Has notado que últimamente se perfuma más");
     System.out.println("(V)Verdadero / (F)Falso");
     respuesta = System.console().readLine().toUpperCase();
     if (respuesta.equals("V")) {
     puntos = puntos+3;
     }
     
     System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
     System.out.println("(V)Verdadero / (F)Falso");
     respuesta = System.console().readLine().toUpperCase();
     if (respuesta.equals("V")) {
     puntos = puntos+3;
     }
     
    if (puntos <= 10) {
    System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    }
    else if ( (puntos > 11 ) && (puntos <= 22) ) {
    System.out.print("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");    
    }
    else if ( (puntos > 22 ) && (puntos <= 29)) {
    System.out.print("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües qué es lo que está pasando por su cabeza.");
    }
    else if ( puntos == 30 ) {
    System.out.print("Esa no es tu pareja, deja de acosar a la gente");
    }
  }
}
