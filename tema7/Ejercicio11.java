/*
 *Joaquín Bello Jiménez 
 */


public class Ejercicio11 {
	
	public static void main (String args[]) {
    
    //Declaro el array y las variables
    //Arrays
    int[] numero  = new int[10];
    int[] primo   = new int[10];
    int[] noPrimo = new int[10];
    //Variables
    int contPrimo   = 0;
    int contNoPrimo = 0;
    int contA = 0;
    
    //Bucle para pedir los números
    System.out.println("Introduce los valores del array");
    for (int i = 0; i < numero.length; i++) {
    System.out.println("-");
    numero[i] = Integer.parseInt(System.console().readLine());
    
    //Comprobar si no es primo
    if ( (numero[i] != 2) || (numero[i]/2 == 0) ){
      noPrimo[contNoPrimo] = numero[i];
      contNoPrimo ++;
    }else {
      primo[contPrimo] = numero[i];
      contPrimo ++;
      }
    }
    //Mostrar la tabla con los valores del array original
    System.out.print("Índice: ");
    for (int j = 0; j < numero.length;j++){
      contA = j;
      System.out.printf("%4d  ", contA);
      
    }
     System.out.print("\nValor: ");
     System.out.print(" ┏━━━━━┳━━━━━┳━━━━━┳━━━━━┳━━━━━┳━━━━━┳━━━━━┳━━━━━┳━━━━━┳━━━━━┓");
     
    
    
    
	}
}

