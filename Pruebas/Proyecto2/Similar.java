package Proyecto2;

/**
*Clase que calcula la similitud de cada documento 
*
*/
public class Similar{

	 Componente [] texto;

	 double sim;

	 ArbolRojinegro <Componente> documento;

	 int []vecesAparece;

	 int noPalabras;

	 int numeroDocumentos;


      
     /**
     *Constructor de clase
     *@param doc
     *@param noPalabras
     *@param noDocs
     *@param frase
     */
	  public Similar(ArbolRojinegro doc, int noPalabras, int noDocs, Componente [] frase, int [] vecesAparece){
            
             texto = frase;
             documento = doc;
             //vecesAparece =
             this.noPalabras = noPalabras;
             numeroDocumentos = noDocs;
             this.vecesAparece = vecesAparece;

	  }


	 public double calculaSim(){

	 	double p1 = 1/noPalabras;

	 	double sim =0;

	 	double similitud =0;

	 	for(in i = ; i< texto.length; i++){

	 		 Componente obj = documento.buscaVertice(texto[i].getPalabra());
             
	 		 FunTF tf = new FunTf(texto[i], documento);
	 		 FunIDF idf = new FunIDF(documento, numeroDocumentos, vecesAparece[i]);
             
             sim += tf.getTf()*idf.getIDF();


	 	}

	 	return sim*p1;
	 }
}