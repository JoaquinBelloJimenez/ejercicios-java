/*
 *Joaquín Bello Jiménez 
 */


public class Ejercicio08 {
	
	public static void main (String args[]) {
    
    //Declaro arrays y las variables
    String[] mes = new String[12];
      mes[0]  = "Enero";
      mes[1]  = "Febrero";
      mes[2]  = "Marzo";
      mes[3]  = "Abril";
      mes[4]  = "Mayo";
      mes[5]  = "Junio";
      mes[6]  = "Julio";
      mes[7]  = "Agosto";
      mes[8]  = "Septiembre";
      mes[9]  = "Octubre";
      mes[10] = "Noviembre";
      mes[11] = "Diciembre";
    int[] temperatura = new int[12];
    int valorA = 0;
    //Bucle para pedir los valores
    System.out.println("Introduce las temperaturas de los meses");
    for (int i = 0; i < 12; i++) {
      System.out.println("Temperatura de "+ mes[i]);
      temperatura[i] = Integer.parseInt(System.console().readLine());
    }
    //Bucle para cambiar de variable del Array
    for (int j = 0; j < 12; j++ ){
      System.out.println("") ;
      System.out.print(mes[j] + "(" + temperatura[j] + "º)");
      //Bucle para mostrar la barra.
      for (int k = 0; k < temperatura[j]; k++){
        System.out.print("▦") ;
      }
     
    }
  }
}
