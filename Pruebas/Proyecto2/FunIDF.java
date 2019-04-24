package Proyecto2;

/**
*clase que modela IDF
*
*/

public class FunIDF{

	 int numeroDocumentos;

	 ArbolRojinegro <Componente> documento;

	 Componente obj;	

	 int 
     
     /**
     *Constructor
     *@param documento
     *@param noDocs
     */
	 public FunIDF(ArbolRojinegro documento1, int noDocs, int aparece){
           
         documento = documento1;
         numeroDocumentos = noDocs; 
         //obj = documento.buscaVertice(palabra.getPalabra());     
	 }
     
     /**
     *Metodo que calcula un algoritmo base 2
     */
     public double log(double num){

     	return (Math.log10(num)/Math.log10(2));
     }


     public double getIDF(){

     	 return(log(noDocs+1)- log(aparece));
     }


}

