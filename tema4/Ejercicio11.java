/*
 * Joaquín Bello Jiménez
 */
public class Ejercicio11 {
  
  public static void main(String[] args) {
    
    System.out.println("Introduce Hora y Minuto, y calcularé el tiempo hasta medianoche");
    
    System.out.print("Hora: ");
    int hora = Integer.parseInt(System.console().readLine());  
    
    System.out.print("Minuto: ");
    int minutos = Integer.parseInt(System.console().readLine());

    int segPasados = (hora * 3600) + (minutos * 60);
    int segFaltantes = (24 * 3600) - segPasados;
            
    System.out.println("Desde las " + hora + ":" + minutos + " hasta medianoche quedan " + segFaltantes + " segundos.");
  }
}
