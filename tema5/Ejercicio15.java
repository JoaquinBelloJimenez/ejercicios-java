/*
 * Joaquin Bello Jiménez
 * 
 */


public class Ejercicio15 {
  
  public static void main(String[] args) {
    
    double resultado = 1;
    
    System.out.println("Introduce una base:");
    double baseN = Double.parseDouble(System.console().readLine());
    System.out.println("Introduce un exponente:");
    int potenciaN = Integer.parseInt(System.console().readLine());
    
    int potencia;    
    int exponente;
    
    for (int i = 1;i <= potenciaN; i++){
      potencia = 1;
      exponente = i;
     for (int j = 0;j < exponente;j++){
       potencia *= baseN;
     }
    System.out.println(baseN + "^" + i + " = " + potencia);

    }
    System.out.println("Fin del programa");
  }
}
