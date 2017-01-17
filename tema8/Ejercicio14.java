/*
 *Joaquín Bello Jiménez 
 */
import biblioteca8.agrupadasA;


public class Ejercicio14 {
	
	public static void main (String args[]) {
    
     //Ejercicio 1 esCapicúa   
      if (biblioteca8.agrupadasA.esCapicua(1221)){
        System.out.println("el 1221 es capicua");
      }else{
        System.out.println("el 1221 no es capicua");
      }
      if (biblioteca8.agrupadasA.esCapicua(135)){
        System.out.println("el 135 es capicua");
      }else{
        System.out.println("el 135 no es capicua");
      }
    //Ejercicio 2 esPrimo
      if (biblioteca8.agrupadasA.esPrimo(14)){
        System.out.println("el 14 es primo");
      }else{
        System.out.println("el 14 no es primo");
      }
    //Ejercicio 3 esPrimo siguiente
        System.out.println("El siguiente número primo de 27 es: ");
        System.out.println(biblioteca8.agrupadasA.primoMayor(27));
    //Ejercicio 4 Potencia
        System.out.println("");
  
  }
	}

