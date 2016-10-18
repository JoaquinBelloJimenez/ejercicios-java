/*
 * Joaquín Bello Jiménez
 */
public class Ejercicio07 {
  
  public static void main(String[] args) {

    System.out.print("Introduce la primera nota: ");
    Double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la segunda nota: ");
    Double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la tercera nota: ");
    Double nota3 = Double.parseDouble(System.console().readLine());

    double media = (nota1 + nota2 + nota3) / 3;

    System.out.printf("La media de las notas es "+ media);
  }
}
