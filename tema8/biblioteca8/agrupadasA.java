 package biblioteca8;


 public class agrupadasA {
   
  /**
   * Es verdadero si el número introducido es capiúa y falso si no lo es.
   * 
   * @param "n" Número a comprobar si es o no capicúa.
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
  
  
  
  
  
  
  
  
  
  
   
   }
