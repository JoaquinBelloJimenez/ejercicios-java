/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

/**
 *
 * @author joaquin
 */
public class ejercicio15 {
  public static void main(String[] args) {
      
    int i = 1; //Variable sumatoria
    do{
       libreria.esPrimo(i);
        if (libreria.esPrimo(i) == true ) {
        System.out.println(i);
        }
        i++;
    }while(i < 1000);
   
   
 }
}
