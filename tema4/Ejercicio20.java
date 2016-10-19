/**
 * Joaquín Bello Jiménez
 */
public class Ejercicio20 {

  public static void main(String[] args) {
    
     System.out.println("¿Tu número es capicúa? (máx 5 cifras): ");
     int numero = Integer.parseInt(System.console().readLine());
     int primera, ultima;
     
    if (numero < 10) {
      System.out.println("Vaya, parece que tenemos a un gracioso");
      System.out.println("Un número es capicúa, claro. ¡Ahora fuera!");
    }
    else if (( numero >= 10 ) && ( numero < 100 )){
      primera = numero % 10;
      ultima  = numero/ 10;
    }
    else if (( numero >= 100 ) && ( numero < 1000 )){
      primera = numero % 100;
      ultima = numero / 100;
    }
    
    else if (( numero >= 1000 ) && ( numero < 10000 )) {
      primera = numero % 1000;
      ultima = numero / 1000;
    }
    
    else if ( numero >= 10000 ) {
      primera = numero % 10000;
      ultima = numero / 10000;
    }
    
    else if ( numero >= 100000 ) {
      primera = numero % 100000;
      ultima = numero / 100000;
    }
    if (primera = ultima){
    System.out.println("Su número es capicúa")}
    else {
    System.out.println("Su número empieza")  
    }
     
  }
}
