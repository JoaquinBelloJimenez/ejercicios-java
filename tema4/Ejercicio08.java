/*
 * Joaquín Bello Jiménez
 */
public class Ejercicio08 {
  
  public static void main(String[] args) {

    System.out.print("Introduce la primera nota: ");
    Double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la segunda nota: ");
    Double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la tercera nota: ");
    Double nota3 = Double.parseDouble(System.console().readLine());

    double media = (nota1 + nota2 + nota3) / 3;

    System.out.printf("Tu media del trimestre es: "+ media);
    
      if (media < 5) {
        System.out.print(" Nota insuficiente");
      }
      else if ((media >= 5) && (media < 6)) {
        System.out.print(" Nota suficiente");
      }
      else if ((media >= 6) && (media < 7)) {
        System.out.print(" Nota bien");
      }
      else if ((media >= 7) && (media < 9)) {
        System.out.print(" Nota notable");
      }
      else if (media >= 9) {
        System.out.print(" Nota sobresaliente");
      }
  }
}
