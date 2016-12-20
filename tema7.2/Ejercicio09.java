/*
 *Joaquín Bello Jiménez 
 */


public class Ejercicio09 {
	public static void main (String args[]){
    
    
    //Crear variables y Array
    int capa;
    int aux1;
    int aux2;
    int contA;
    int contB;
    int[][] n = new int[12][12];
    
    
    System.out.println("Array original");
    System.out.println("--------------");

    for(contA= 0; contA< 12; contA++) {
      for(contB= 0; contB< 12; contB++) {
        n[contA][contB] = (int)(Math.random()*101);
        System.out.printf("%5d", n[contA][contB]);
        }
      System.out.println();
    }




    for(capa = 0; capa < 6; capa++) {
      

      aux1 = n[capa][11 - capa];
      for (contA= 11 - capa; contA> capa; contA--) {
        n[capa][contA] = n[capa][contA- 1];
      }
        
     
      aux2 = n[11 - capa][11 - capa];
      for (contA= 11 - capa; contA> capa + 1; contA--) {
        n[contA][11 - capa] = n[contA- 1][11 - capa];
      }
      n[capa + 1][11 - capa] = aux1;
      

      aux1 = n[11 - capa][capa];
      for (contA= capa; contA< 11 - capa - 1; contA++) {
        n[11 - capa][contA] = n[11 - capa][contA+ 1];
      }
      n[11 - capa][11 - capa - 1] = aux2;
        

      for (contA= capa; contA< 11 - capa - 1; contA++) {
        n[contA][capa] = n[contA+ 1][capa];
      }
      n[11 - capa - 1][capa] = aux1;

    }

    
    System.out.println("\n\nSentido de las agujas del reloj");
    System.out.println("--------------------------------------------------");

    for(contA= 0; contA< 12; contA++) {
      for(contB= 0; contB< 12; contB++) {
        System.out.printf("%5d", n[contA][contB]);
      }
      System.out.println();
    }
    
  }
}
