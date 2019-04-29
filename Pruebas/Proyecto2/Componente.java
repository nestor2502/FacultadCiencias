
package Proyecto2;

/**
*Clase que contiene una palabra y las vecxes que se repite
*
*
*/
public class Componente implements Comparable<Componente>{

     String palabra;
     int veces_repetidas;


     /**
     *Constructor que asigna un valor a palabra
     *@param palabra
     */
     public Componente(String palabra){

     	 this.palabra = palabra;
     	 veces_repetidas=1;
     }

    /**
    *Metodo que regresa la palabra de la clase
    *@return palabra
    */
     public String getPalabra(){

     	 return palabra;
     }

     /**
     *Metodo que asigna el numero de veces quye se repite la palabra
     *
     */
     public void setVeces(){

     	  veces_repetidas ++;
     }

     /**
     *Metodo que devuelve el numero de veces que se repite una palabra
     *@return  numero de veces que se repite la palabra
     */

     public int getVeces(){

     	 return veces_repetidas;
     }

     @Override 
	 public int compareTo(Componente c){

	 	   if(c == null)

	 	   	throw new NullPointerException();

	 	   return palabra.compareTo(c.getPalabra());

	 }


}