/**
 * Joaquín Bello Jiménez
 */
public class Ejercicio18 {

  public static void main(String[] args) {
    
     System.out.println("Te diré la  cifra de un número entero (máx 6 cifras): ");
     int numero = Integer.parseInt(System.console().readLine());
     int cifra = 0;
     
    if ( numero < 10 ) {
      cifra = numero;
    }
    
    if (( numero >= 10 ) && ( numero < 100 )) {
      cifra = numero / 10;
    }
    
    if (( numero >= 100 ) && ( numero < 1000 )) {
      cifra = numero / 100;
    }
    
    if (( numero >= 1000 ) && ( numero < 10000 )) {
      cifra = numero / 1000;
    }
    
    if ( numero >= 10000 ) {
      cifra = numero / 10000;
    }
    
    if ( numero >= 100000 ) {
    cifra = numero / 100000;
    }
    
    if ( numero >= 100000 ) {
    System.out.println("Cifra superior a 6 dígitos");
    }
    else {System.out.println(cifra);
    }
     
  }
}
