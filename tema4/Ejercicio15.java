/**
 * Joaquín Bello Jiménez
 */
public class Ejercicio15 {

  public static void main(String[] args) {
    
    System.out.println("Introduce un carácter para el dibujo");
    String c = System.console().readLine();
    System.out.println("Elige la dirección:");
    System.out.println("1 = Arriba | 2 = Abajo | 3 = Iquierda | 4 = Derecha");
    int direccion = Integer.parseInt(System.console().readLine());

    switch(direccion) {
      case 1:
        System.out.println("  " + c);
        System.out.println(" " + c + c + c);
        System.out.println(c + c + c + c + c);
        break;
      case 2:
        System.out.println(c + c + c + c + c);
        System.out.println(" " + c + c + c);
        System.out.println("  " + c);
        break;
      case 3:
        System.out.println("    " + c);
        System.out.println("  " + c + " " + c);
        System.out.println(c + " " + c + " " + c);
        System.out.println("  " + c + " " + c);
        System.out.println("    " + c);
        break;
      case 4:
        System.out.println(c);
        System.out.println(c + " " + c);
        System.out.println(c + " " + c + " " + c);
        System.out.println(c + " " + c);
        System.out.println(c);
        break;
      default:
    }
  }
}
