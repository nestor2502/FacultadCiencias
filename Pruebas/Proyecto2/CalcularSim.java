package Proyecto2;

/**
*Clase que calcula la similitud de un documento
*
*/
public class CalcularSim{
     
     //Numero de archivos en el que aparece [t]
     int [] no_doc_termino;
     //Numero de ocurrencias de el termino [t] en el documento n
     int [] frecuencia_termino;
     //Numero de archivos ingresados por el usuario
     int no_archivos;
     //Numero de palabras totales del archivo
     int no_palabras;



	 /**
	 *Constructor que recibe como parametro
	 *@param no_doc_termino      
	 *@param frecuencia_termino  
	 *@param no_archivos         
	 *@param no_palabras         
	 */
	 public CalcularSim(int [] no_doc_termino, int [] frecuencia_termino, int no_archivos, int no_palabras){
     
         this.no_doc_termino = no_doc_termino;
         this.frecuencia_termino = frecuencia_termino;
         this.no_archivos = no_archivos;
         this.no_palabras = no_palabras;
            
	 }

	 /**
     *Metodo que calcula logaritmo base dos de un numero num
     *@param num
     *@return log2(num)
     */
     public double log(double num){	 
     	 double n = (double)(Math.log10(num)/Math.log10(2));
     	 return n;
     }
     
     /**
     *Metodo que obtiene TF de un termino del documento
     *@return tf
     */
     public double getTF(int frecuencia_termino2){
     	 double tf =0;
         if(frecuencia_termino2 >0){
          	 tf= (double)((Math.log10(frecuencia_termino2)/Math.log10(2)))+1;
          }
         else {
          	 tf =  0;
          }
         return tf;
     }

     /**
     *Metodo que devuelve IDF de un terminio de la frase
     *@return idf
     */
     public double getIDF(int no_doc_termino2){
     	if(no_doc_termino2!=0){
          double x = (double)(no_archivos+1)/no_doc_termino2;
     	   double idf = (double)(Math.log10(x)/Math.log10(2));
          return idf;}

         else
         	return 0;
     }

     /**
     *Metodo que calcula similitud de un documento
     *
     *
     */
     public double getSim(){

     	 double sim=0;
     	 double similitud=0;
     	 double p1 = divide(1,no_palabras);
     	 for(int i = 0 ; i< frecuencia_termino.length; i++){
     	 	 sim =sim+ getTF(frecuencia_termino[i])*getIDF(no_doc_termino[i]);
     	 }
     	 similitud = p1*sim;

     	 return similitud;
     }

     public double divide(int a, int b){
     	double c = (double)a/b;
     	return c;
     }






}


