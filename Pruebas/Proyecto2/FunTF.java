package Proyecto2;
                          
public class FunTF implements Comparable<Componente>{

	 //int [] frecuencia;

	 Componente palabra ;

	 ArbolRojinegro <Componente> documento;

	 int ocurrencias;

	 boolean existe;





     /**
     *Constructor que inicia la clase
     *
     */
	 public FunTF(Componente  frase, ArbolRojinegro <Componente> documento){
	 	 this.frase = frase;
	 	 this.documento  = documento;
	 	 Componente obj = documento.buscaVertice(palabra.getPalabra());  
         ocurrencias = obj.getVeces();
	 }
     

     /**
     *Metodo que calcula logaritmo base dos de un numero
     *
     */
     public double log(double num){

     	return (Math.log10(num)/Math.log10(2));
     }


     /**
     *Metodo que obtiene TF
     *@return tf
     */
     public double getTF(){

     	  double tf =0;
          if(ocurrencias>0){
          	 tf= log(ocurrencias)+1
          }
         else {
          	  tf =  0;
          }
          	return tf;
     }

}
