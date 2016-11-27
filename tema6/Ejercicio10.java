/*
 *Joaquín Bello Jiménez
 */


public class Ejercicio10 {

	public static void main (String args[]) {
    
    int nCaracter = 0;
    String caracter = "A";
    int anchoFila = 0;
    System.out.println("Líneas y caracteres aleatorios");
    System.out.println();
    
    
    for (int i = 0; i <10; i++){
      nCaracter = (int)((Math.random()*6) + 1);
      switch (nCaracter){
      case 1:
      caracter = "*";
      break;
      case 2:
      caracter = "-";
      break;
      case 3:
      caracter = "=";
      break;
      case 4:
      caracter = ".";
      break;
      case 5:
      caracter = "|";
      break;
      case 6:
      caracter = "@";
      break;
      }
      anchoFila = (int)((Math.random()*40)+ 1);
      for (int j = 0; j <= anchoFila; j++){
        System.out.print(caracter);
      }
    System.out.println("");
    }
  }
}
