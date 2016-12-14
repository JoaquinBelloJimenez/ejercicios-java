/*
 *Joaquín Bello Jiménez 
 */


public class Aleatoriedad {
	
	public static void main (String args[]) {
    
    int[] numero = new int[50]; //Array que se generará de forma aleatoria
    int aux = 0;   //Variable uxiliar
    int nuevo = 0; //Cuenta los números que no han aparecido
    int contA = 0; //Contador del bucle While
    
    while (contA < 50){
      aux = (int)((Math.random()*100)+1);    //Se genera un número aleatorio en "aux"
      nuevo = 0;                             //El contador de número nuevos se pone a 0
      for (int contB = 0;contB <50;contB++){ //Bucle para comprobar si el número es nuevo
        if (aux != numero[contB]){           //Comprueba si el número ya existe
            nuevo ++;                        //Si es nuevo "nuevo + 1"
          }
       }
       if (nuevo == 50){                     //Si el número ha sido nuevo en todos los casos
         numero[contA] = aux;                //Escribir en la posición actual el valor aleatorio
         contA ++;                           //Contador de escritura del array
       }
      }
    for (int i=0;i < 50;i++){                //Bucle para mostrar los valores del array
    System.out.println(numero[i]);
    }
	}
}

