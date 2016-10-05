/**
 * Horario de clase COLORES
 *
 * @author Joaquin Bello
 */

public class ejercicio05 {
  public static void main(String[] args) {

    String morado = "\033[35m";
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String blanco = "\033[37m";
    String celeste = "\033[36m";
    

    System.out.println(blanco + "Lunes\tMartes\tMiérc.\tJueves\tViernes");
    System.out.println("======\t=======\t=======\t======\t======");
    System.out.println(rojo + "S.INF"+ verde + "\tPROG"+ verde + "\tPROG"+ azul +  "\tB.D."+ naranja + "\tL.M.");
    System.out.println(rojo + "S.INF"+ verde + "\tPROG"+ verde + "\tPROG"+ azul + "\tB.D."+ naranja + "\tL.M.");
    System.out.println(rojo + "S.INF"+ verde +"\tPROG"+ naranja + "\tL.M."+ azul + "\tB.D."+ celeste +"\tE.D.");
    System.out.println(morado + "FOL"+ azul + "\tB.D."+ naranja + "\tL.M."+ verde + "\tPROG"+ rojo + "\tS.INF");
    System.out.println(morado + "FOL"+ azul +  "\tB.D."+ celeste +"\tE.D."+ verde + "\tPROG"+ rojo + "\tS.INF");
    System.out.println(morado + "FOL"+ azul +  "\tB.D."+ celeste +"\tE.D."+ verde + "\tPROG"+ rojo + "\tS.INF");
  }
}
