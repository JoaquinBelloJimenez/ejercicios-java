 package biblioteca8;


 public class agrupadasA {
   
     /**
   * Es verdadero si el número introducido es capiúa y falso si no lo es.
   * 
   * @param "n" Número a comprobar si es o no capicúa.
   * @return  Si es capicúa Verdadero, en caso contrario Falso.
   */
   
   
   
  public static boolean girarNumero(long n) {   
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
   
   }
