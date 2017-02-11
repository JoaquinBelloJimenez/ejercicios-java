/*
 *Joaquín Bello Jiménez 
 */

public class Caballo {
  private String nombre;
  private String color;
  private double peso;
  private int edad;
  
  Caballo (String n, String c, double p, int e){
    this.nombre = n;
    this.color = c;
    this.peso = p;
    this.edad = e;
  }
  
  public String getNombre(){
    return this.nombre;
  }
    
  public int getEdad(){
  return this.edad;
  }
  
  
  public void reir(){
  System.out.println("jijijijijiji");
  }
  public void cumple(){
  System.out.println("El caballo " + this.nombre + " ha cumplido " + (this.edad + 1) + " años.");
  }
}
