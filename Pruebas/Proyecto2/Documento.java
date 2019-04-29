package Proyecto2;

/**
*Clase donde se gusrdara caracteristicas
*de la ruta ingresada por el usuario
*
*/
public class Documento implements Comparable<Documento>{

	  
     String nombre_documento;
	 String ruta;
	 Double similitud;


     /**
     *Constructor que asigna un valor a ruta
     *@param ruta
     */
     public Documento(String ruta){

     	 this.ruta = ruta;
     	 this.nombre_documento = ruta;
     }

    /**
    *Metodo que regresa la ruta de la clase
    *@return ruta
    */
     public String getRuta(){

     	 return ruta;
     }

     /**
    *Metodo que regresa el nombre del documento
    *@return ruta
    */
     public String getNombre(){

     	 return nombre_documento;
     }

     /**
     *Metodo que asigna el numero de veces quye se repite la ruta
     *
     */
     public void setSimilitud(double similitud){

     	  this.similitud = similitud;
     }

     /**
     *Metodo que devuelve el numero de veces que se repite una palabra
     *@return  numero de veces que se repite la palabra
     */

     public Double getSimilitud(){

     	 return similitud;
     }

     @Override 
	 public int compareTo(Documento c){

	 	   if(c == null)

	 	   	throw new NullPointerException();

	 	   return similitud.compareTo(c.getSimilitud());

	 }
    }
