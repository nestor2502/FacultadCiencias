package src;
/**
 * Clase con varias funciones de dispersión.
 */
public class Dispersiones{

    public static int dispersionXOR(byte[] a){

      return -1;
    }
    
    public static int dispersionBJ(byte[] a){
	 return -1;
    }
    
    public static int dispersionDJB(byte[] a){
    	 int djb = 5381;
    	 for(int i =0; i<a.length;i++){
    	 	 djb= djb*33 +(a[1 & 0xFF]);
    	 }
	  return djb;
    }
}