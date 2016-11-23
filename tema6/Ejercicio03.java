/*
 *Joaquín Bello Jiménez
 */


public class Ejercicio03 {

	public static void main (String args[]) {

    String barajaPalo = "";
    String barajaCarta = "";
    
    int numeroPalo = (int)(Math.random()*4) + 1;
    
    switch(numeroPalo) {
      case 1:
        barajaPalo = "Bastos";
        break;
      case 2:
        barajaPalo = "Espadas";
        break;
      case 3:
        barajaPalo = "Oros";
        break;
      case 4:
        barajaPalo = "Copas";
      default:
    }

    int numeroCarta = (int)(Math.random()*13) + 1;
    
    switch(numeroCarta) {
      case 1:
        barajaCarta = "As";
        break;
      case 11:
        barajaCarta = "Sota";
        break;
      case 12:
        barajaCarta = "Caballo";
        break;
      case 13:
        barajaCarta = "Rey";
        break;
      default:
        barajaCarta = String.valueOf(numeroCarta);
    }
    
    System.out.println(barajaCarta + " de " + barajaPalo);
  }
}
