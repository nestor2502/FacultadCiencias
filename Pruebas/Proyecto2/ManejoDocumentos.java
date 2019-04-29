package Proyecto2;

import java.util.Iterator;

/**
*Clase donde se ingresaran los documentos 
*
*/
/////////// Tengo que ver como guardar los documentos
public class ManejoDocumentos {
	 //Lista con los nombres de cada documento ingresado
	 Lista <Documento> doc_ingresados;
	 //Lista con los documentos transformados
	 Lista <String []> doc_transformado;
	 //Lista con los documentos ya ordenados
	 Documento [] doc_ordenados;
	 ManipulaDocumento manipula;
	 String [] frase;
	 //pruebas
	 Double [] simi;
	 String [] docN;
	 String [] doc;
     
     /**
     *Constructor de clase 
     *@param frase
     */
	 public  ManejoDocumentos(String frase){
	 	 //la frase la convertimos en un arreglo de tipo string
	 	 String [] frase_transformada= Transformar.arreglo(frase);
	     this.frase=frase_transformada;
	 	 manipula = new ManipulaDocumento(this.frase);
	 	 //se inician listas
	 	 doc_ingresados = new Lista <Documento>();
	 	 doc_transformado = new Lista <String []>();
	 	 //doc_ordenados= new Lista <Documento>();
	 }
     
     /**
     *Metodo que procesa el documento ingresado 
     *@param ruta
     */
	 public void agregaDocumento(String ruta){

	 	 Documento dn = new Documento(ruta);
	 	 Textos txt = new Textos(ruta);
	 	 //suponemos que ya me regresa el arreglo;
	 	 doc = txt.agregation();
	 	 //se ingresa a la lista de tipo documento
         doc_ingresados.agregaFinal(dn);
         //se ingresa documento transformado en arreglo
	 	 doc_transformado.agregaFinal(doc);
	 	 //se agrega documento a la clase manipulador

	 }

	 /**
	 *Metodo que cambia la frase por si no se quieren eliminar los documentos
	 *@param frase
	 */
     public void setFrase(String frase){
         
	 	 //Transformar transforma = new Transformar();
	 	 //la frase la convertimos en un arreglo de tipo string
	 	 String [] frase_transformada= Transformar.arreglo(frase);
	 	 this.frase=frase_transformada;
         manipula = new ManipulaDocumento(this.frase);
     }
     
     /**
     *Metodo que calcula la similitud por documento
     *@param frase
     */
     public void calculaSimilitud(){
     Iterator <String []> iterator = doc_transformado.iterator();
     Iterator <Documento> iterator2 = doc_ingresados.iterator();
     int i=0;
     
     while(iterator.hasNext()==true){
         //se ingresa cadwa documento 
         docN = iterator.next();
         manipula.ordenaDocumento(docN);
      }
     manipula.setNA();
     manipula.setFT();
     manipula.setSimilitud();
     simi = manipula.getSim();
     
     while(iterator2.hasNext()==true){

     	 Documento dn = iterator2.next();
     	 dn.setSimilitud(simi[i]);
     	 i++;
     } 
     }
     
     public void pruebaSim(){

     	for(int i = 0; i< simi.length;i++){
     		 System.out.println(simi[i]);
     	}
     	for(int i = 0; i< docN.length;i++){
     		 System.out.print(docN[i]);
     	}
     	System.out.println();
	 System.out.println();
	 System.out.println();
     	for(int i = 0; i< frase.length;i++){
     		 System.out.println(frase[i]);
     	}
     	 System.out.println();
	     System.out.println();
	     System.out.println("documento1");
     	for(int i = 0; i< doc.length;i++){
     		 System.out.print(doc[i]);
     	}
     	System.out.println();
	     System.out.println();
	     System.out.println("obtengo cadenas");
	     manipula.getCadenas();
         System.out.println();
	     System.out.println();
	     //System.out.println("obtengo cadenas");
	      //doc_transformado


     }


     



     /**
     *Metodo que ordena los documentos y los ingresa a la lista 
     *de documentos ordenados
     */
     public void ordenaDocumentos(){
     	 Iterator <Documento> iterator2 = doc_ingresados.iterator();
         Documento [] nuevo = new Documento[doc_ingresados.getLongitud()];
         int i =0;
         while(iterator2.hasNext()==true){
         	 nuevo[i]= iterator2.next();
         	 i++;
         }

         for(int k =0; k<nuevo.length;k++){

         	 for(int j =0; j<nuevo.length-1-k;j++){
         	 	  if(nuevo[j].compareTo(nuevo[j+1])>0){
         	 	  	  Documento tmp = nuevo[j];
         	 	  	  nuevo[j]=nuevo[j+1];
                      nuevo[j+1]=tmp;
         	 	  }
         	 }
         }

         doc_ordenados= nuevo;

     }

     public String [] getOrdenados(){

     	 String [] ordenados = new String[doc_ordenados.length];

     	 for(int i =0; i< ordenados.length;i++){
     	 	 Documento obj = doc_ordenados[i];
     	 	 String nombre = obj.getNombre();

     	 	 ordenados[i]= nombre;
     	 }
     	 String [] ordenados2 = new String[ordenados.length];
     	 int j =ordenados.length;
     	 for(int i=0; i< ordenados.length;i++){
     	 	 ordenados2[i]=ordenados[j-1];
     	 	 j--;
     	 }

     	 return ordenados2;
     }

     

   


}