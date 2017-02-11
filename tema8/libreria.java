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
class libreria {
 /**
   * Es verdadero si el número introducido es capiúa y falso si no lo es.
   * 
   * @param n
   * @return  Si es capicúa Verdadero, en caso contrario Falso.
   */
   
   
   
  public static boolean esCapicua(long n) {   
    long aux = 0;
    long g = 0;
    long aux2 = n;
    
   do{
     aux = aux2 % 10;
     aux2 = aux2 / 10;
     g = g * 10 + aux;
   }while (aux2 > 0);
  
    if (n == g){
     return true; 
    }
    else{
      return false;
    }
  }
  
  /**
   * Es verdadero si el número introducido es primo y falso si no lo es.
   * 
   * @param "n" Número a comprobar si es o no primo.
   * @return  Si es primo Verdadero, en caso contrario Falso.
   */
   
   
   
  public static boolean esPrimo(long n) {   
    long aux = 1;
    long aux2 = 0;
    
   do{
      if (n % aux == 0){
        aux2 ++;
      }
      aux ++;
   }while (aux <= n);
  
    if (aux2 == 2){
     return true; 
    }
    else{
      return false;
    }
  }
  
    /**
   * Siguiente primo
   * 
   * @param "n" Número a comprobar si es o no primo.
   * @return  Si es primo Verdadero, en caso contrario Falso.
   */
   
   
   
  public static long primoMayor(long n) {   
    long aux = 1;
    long aux2 = 0;
    boolean primo = false;
    
   do{
     n ++; 
     do{
        if (n % aux == 0){
          aux2 ++;
        }
        aux ++;
     }while (aux <= n);
    
      if (aux2 == 2){
       primo = true;
      }
      else{
        primo = false;
      }
      }while (primo = false);
      
      return n;
      
    }
  
  public static long potencia(long b, long e ) {   
    long x = 1;
    long aux = 1;
    
   do{
     x = x*b;
     aux ++; 
     }while (aux <= e);
      
      return x;
      
    }
    
  public static long cuentaNumeros(int n) {
    int respuesta = 0;
    int aux = 100;
    
   do{
     n = n / 10;
     respuesta ++;
   }while (n > 0);
  
    return respuesta;
  }
 }
