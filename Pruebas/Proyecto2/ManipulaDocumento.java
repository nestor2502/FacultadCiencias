package Proyecto2;
import src.*;
import java.util.Iterator;

/**
*Clase que manipula el documento ingresandolo a un arbol 
*
*/
public class ManipulaDocumento{
     //Lista de nombres de archivos ingresados por el usuario
// Lista <String> documentos;                     /////Listo
	 //Lista con los documentos ordenados
	 Lista <ArbolRojinegro <Componente>> cadenas;   /////Listo
	 //ArbolRojinegro<String> hola = new ArbolRojinegro();
	 //Frase de consulta
	 String [] frase;
	 //Numero de archivos en el que aparece [t]
     int [] no_doc_termino;                   ////Listo
     //Numero de ocurrencias de el termino [t] en el documento n
     Lista<int []> frecuencia_termino;        //////Listo
     //Numero de archivos ingresados por el usuario
     int no_archivos=0;
     //*Numero de palabras totales por archivo
     Lista <Integer> no_palabras;            ////////Listo
     //Calcula la similitud del archivo
     Lista <Double> similitud;


     /**
     *Constructor de la clase
     *
     */
     public ManipulaDocumento(String [] frase){

     	 this.frase = frase;
     	 //se inicia lista con los nombres de los archivos
//documentos = new Lista<String>();
     	 //se inicia lista de arboles para cada documento
     	 cadenas = new Lista<ArbolRojinegro<Componente>>();
     	 //se inicia con 0
         no_doc_termino = new int[frase.length+1];
         //se inicia listra de numero de palabras
         no_palabras = new Lista <Integer>();
     	 //se inicia frecuancia_termino
         frecuencia_termino = new Lista<int []>();
         //se inicia arreglo con la similitud de cada documento;
         //se inicia lista de similitud de frase por docuent
         similitud = new Lista<Double>();


              

     }
     
     /**
     *Metodo que ingresa un documento a un arbol
     *@param documento 
     */
     public void ordenaDocumento(String [] documento){//, String nombre){
     	 String [] nuevo= documento;
     	 Componente q;
         //se crea arbol para el archivo;
         ArbolRojinegro <Componente> a1 = new ArbolRojinegro<Componente>();
         //se guarda el nombre del documento en la lista
//documentos.agregaFinal(nombre);
         no_palabras.agregaFinal(documento.length);
         //se agrega el documentoal arbol
     	 for(int i =0 ; i<nuevo.length; i++){
     	  	 //Vemos si se encuentra la palabra [i]
     	     q = new Componente(nuevo[i]);
     	     //vemos si ya esta la palabra para agregarlo
     	  	 if(a1.existeVertice(q)== false){
                 a1.agrega(q);
     	  	   }
     	  	 else if(a1.existeVertice(q)==true){
               Componente m = a1.buscaVertice2(q); 
     	  	 	 m.setVeces();
     	  	 }
     	 }
         //se añade el arbol a la lista
     	 cadenas.agregaFinal(a1);
        no_archivos++;
     }

     /**
     *Metodo que nos regresa numero documentos en el que aparece una palabra 
     *ND == numero de Documentos *nos sirve para IDF
     */
     public void setNA(){
         //se crea iterador
     	 Iterator <ArbolRojinegro <Componente>> iterator = cadenas.iterator();
     	 int i =0;
         while(iterator.hasNext()== true){
         	 //se obtiene el elemento
         	 ArbolRojinegro <Componente> doc = iterator.next();
         	 
         	 //se busca palabra en el arbol
         	 for(int j =0; j< frase.length; j++){
                Componente c1 = new Componente(frase[j]);
         	     if(doc.existeVertice(c1)==true){
                     no_doc_termino[j]++;
                     //j++;
         	 }
         	 }
         }
     }

     /**
     *Metodo que nos regresa las ocurrencias la palabra t en cada documento
     *FT == frecuencia del termino *nos sirve para TF
     */public void setFT(){
          //se crea iterador
     	 // Iterator <int []> iterator = frecuencia_termino.iterator();
         Iterator <ArbolRojinegro <Componente>> iterator = cadenas.iterator();
     	 int i =0;
     	 
     	 
         while(iterator.hasNext()== true){
         	 //se obtiene el elemento
         	 ArbolRojinegro <Componente> doc = iterator.next();
             int [] ft = new int[frase.length];
         	 //se busca palabra en el arbol
         	 for(int j =0; j< frase.length; j++){
         	 	 Componente q = new Componente(frase[j]);
                 if(doc.existeVertice(q)== true){
         	 	 Componente m = doc.buscaVertice2(q);
         	 	 //buscando vertice en el arbol y asignando a cada palabra si frecuencia
         	 	 ft[j]= m.getVeces();}
         	 }
             frecuencia_termino.agregaFinal(ft);
         	 }
         }

     /**
     *Metodo que devuelve cuantos archivos estan almacenados
     *@return no_archivos
     */
     public int getNumeroArchivos(){
     	 return no_archivos;      
     }
     
     /**
     *Metodo que calcula la similitud de cada archivo
     */
     public void setSimilitud(){

         //Iterator <Double> iterator1 = similitud.iterator(); iterator1.hasNext()==true&&
         Iterator <int []> iterator2 = frecuencia_termino.iterator();
         Iterator <Integer> iterator3 = no_palabras.iterator();
          
     	 for(int i =0; i< no_archivos; i++){

             if(iterator2.hasNext()==true && iterator3.hasNext()==true){
                 //frecuencia del termino en el documento n
                 int [] ft =  iterator2.next();

                 //Tamaño de documento n 
                 Integer nP = iterator3.next();
                 CalcularSim docN = new CalcularSim(no_doc_termino,ft, no_archivos,nP);
                 //similitud[i]= docN.getSim();
                 similitud.agregaFinal(docN.getSim());
            }
         }


     } 
     
     /**
     *Metodo que devuelve la similitud de cada documento
     *@return similitud
     */
     public Double [] getSim(){
         Double [] sim = new Double[no_archivos];
         Iterator <Double> iterator = similitud.iterator(); 
         for(int i = 0; i< sim.length;i++){   
             if(iterator.hasNext()==true){
                 sim[i]= (Double)iterator.next();
             }
         }
         return sim;
     }

     public void getCadenas(){
         Iterator <ArbolRojinegro <Componente>> iterator = cadenas.iterator();

         while(iterator.hasNext()==true){
         ArbolRojinegro <Componente>prueba = iterator.next();
         prueba.bfs( i -> System.out.println(i.getPalabra()));
         System.out.println();
         }
     }

     public void getNA(){

        for(int i =0; i<no_doc_termino.length;i++){

              System.out.println(no_doc_termino[i]);
              System.out.println();
        }
     }

     public void getTF(){

         Iterator <int []> iterator = frecuencia_termino.iterator();
         while(iterator.hasNext()==true){
         int[] p1 = iterator.next();
         for(int i = 0 ; i<frase.length;i++){
             System.out.println(p1[i]);
         }
         System.out.println();
         }
     


     }

     public void getNoPalabras(){
         Iterator <Integer> iterator = no_palabras.iterator();

         while(iterator.hasNext()== true){

              System.out.println(iterator.next());
              System.out.println();
         }

     }

     public void getSim2(){
        Iterator <Double> iterator = similitud.iterator();

         while(iterator.hasNext()==true){
             System.out.println(iterator.next());
         }
     }


     
}
