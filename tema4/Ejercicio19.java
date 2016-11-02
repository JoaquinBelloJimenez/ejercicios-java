/**
 * Joaquín Bello Jiménez
 */
public class Ejercicio19 {

  public static void main(String[] args) {
    
     System.out.println("Te cuantas cifra tiene tu nñumero (máx 5 cifras): ");
     int numero = Integer.parseInt(System.console().readLine());
     int cifras = 0;
     
    if ( (numero > -10) && (numero < 10)) {
      cifras = 1; 
    }
    
    else if (( numero > -100 ) && ( numero < 100 )) {
      cifras = 2;
    }
    
    else if (( numero > -1000 ) && ( numero < 1000 )) {
      cifras = 3;
    }
    
    else if (( numero > -10000 ) && ( numero < 10000 )) {
      cifras = 4;
    }
    
    else if (( numero > -100000 ) && ( numero < 100000 )) {
      cifras = 5;
    }
    System.out.println("Su número tiene estas cifras: " + cifras);
    
     
  }
}
