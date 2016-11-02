/*
 * Joaquin Bello Jiménez
 * 
 */


public class Ejercicio07 {
  
    public static void main (String args[]) {
    
    System.out.println("La caja fuerte");
    int clave = 4848;
    int tuclave = 0;
    System.out.println("Introduce el código de 4 dígitos");

  
    for (int c = 1; c <= 4; c ++) {
      if (tuclave != clave){
        tuclave = Integer.parseInt(System.console().readLine());
        if (tuclave == clave){
          System.out.println("Bien");}
        else{
          System.out.println("Intento número " + c + " Fallido, vuelve a probar.");
        }
      }
    }
    if (tuclave == clave){
     System.out.println("¡Acertaste, coge la pasta y huye!");
    }
    else {
      System.out.println("La has pifiado, la poli está en camino.");
    }
  }
}

