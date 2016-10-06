/*
 * Joaquin Bello
 */


public class Ejercicio01 {
  
  public static void main (String args[]) {
    
    System.out.print("Introduzca un día de la semana: ");
    String dia = (System.console().readLine().toLowerCase());
    if (dia.equals("lunes")){
      System.out.print("El Lunes a primera toca S.Inf");
    }else if (dia.equals("martes")){
      System.out.print("El Martes a primera toca Prog");
    }else if (dia.equals("miercoles")){
      System.out.print("El Miercoles a primera toca Prog");
    } else if (dia.equals("jueves")){
      System.out.print("El Jueves a primera toca B.Datos");
    } else if (dia.equals("viernes")){
      System.out.print("El Viernes a primera toca L.Marcas");
    } else {System.out.print("Dia incorrecto");
    }
  }
}

