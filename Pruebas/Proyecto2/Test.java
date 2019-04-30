package Proyecto2;

/**
*
*Clase de pruebas
*
*/
public class Test{

	 

	 public static void main(String[] args) {
	 	
	 String frase []= {"hola","como","estas","amigo"};

	 String doc1 []= {"hola","como","estas","amigo", "hola", "men"};
	 String doc2 []= {"nestor","como","estas","compa"};
	 String doc3 []= {"esta","es","clase","amigo"};
	 String doc4 []= {"hola","hola","hola","hola", "como"};
     Double []similitud;
     
     ManipulaDocumento md = new ManipulaDocumento(frase);
     md.ordenaDocumento(doc1);
     md.ordenaDocumento(doc2);
     md.ordenaDocumento(doc3);
     md.ordenaDocumento(doc4);
     md.setNA();
     md.setFT();
     md.setSimilitud();
     similitud = md.getSim();
     for(int i = 0; i< similitud.length; i++){
     	 System.out.println(similitud[i]);
     }
     System.out.println("numero de archivos: "+md.getNumeroArchivos());
     //double n = (double)5/4;
     //System.out.println(n);
     //	System.out.println( (Math.log((n))/Math.log(2)));
	 
     md.getCadenas();
     System.out.println("en cuantos documentos aparece cada palabra");
     md.getNA();
     System.out.println();
     System.out.println("cuantas veces aparece cada palabra en cada documento");
	 md.getTF();
	 System.out.println("cuantas palabras tiene cada documento");
	 md.getNoPalabras();
	 System.out.println("Similitud de cada documento");
	 md.getSim2();
	 System.out.println();
	 System.out.println();
	 System.out.println();
	 System.out.println("Prueba de lectura de archivos y si similitud");
	 String [] frase2 = {"hola","como","estas","amigo"};
	 ManejoDocumentos m2 = new ManejoDocumentos("hola como estas amigo");
	 m2.agregaDocumento("/home/nestor/Escritorio/ejemplo1.txt");
      m2.agregaDocumento("/home/nestor/Escritorio/ejemplo2.txt");
      m2.agregaDocumento("/home/nestor/Escritorio/ejemplo3.txt");
      m2.agregaDocumento("/home/nestor/Escritorio/ejemplo4.txt");
      m2.agregaDocumento("/home/nestor/Escritorio/ejemplo5.txt");
     m2.calculaSimilitud();
     m2.ordenaDocumentos();
     String [] ahoraSi = m2.getOrdenados();
     //m2.pruebaSim();
     for(int i=0;i<ahoraSi.length;i++){

     	 System.out.println(ahoraSi[i]);
     	 System.out.println();
     	 System.out.println();

     }
     m2.pruebaSim();


     
     }


     }
     /**
     System.out.println();

     System.out.println();

     System.out.println();
     int f = 2;
     int g = 5;
     //double h = (double)f;

     Test lo = new Test();
     double n = lo.divide(1, 5);
     Double a =lo.log(2);
     Double b =lo.log(5);
     System.out.println(n);
     System.out.println(b);
     System.out.println(lo.log(2));
     System.out.println(a-b);
     System.out.println("idf "+lo.getIDF(2, 1));
     System.out.println("tf "+lo.getTF(2));
     System.out.println("posible resultado: "+lo.getIDF(3, 1)*lo.getTF(2)*0.2);
     int w=5;/// tamaño de la frase
     int x=2;//frecuencia del termino en el documento
     int z=1;//numero de archivos en el, que aparece t
     System.out.println("sim "+ lo.getSim(w, x, z));

     //System.out.println(n);
     //	System.out.println( (Math.log((n))/Math.log(2)));
	 

	 }
	 public double log(double num){
     	 double n = (double)(Math.log10(num)/Math.log10(2));
     	 return n;
     }
     public double getIDF( int no_archivos, int no_doc_termino2){
     	if(no_doc_termino2!=0){
          double x = (double)(no_archivos+1)/no_doc_termino2;
     	   double idf = (double)(Math.log10(x)/Math.log10(2));
          return idf;}

         else
         	return 9;
     }

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

     public double divide(int a, int b){
     	double c = (double)a/b;
     	return c;
     }

     public double getSim(int a, int b, int c){
//5, 2, 3 
     	 double sim=0;
     	 double similitud=0;;

     	 double a1 =getTF(2);
     	 double a2 = getIDF(2, 1);
     	 double a3 = (double)(1/5);
     	
     	 sim =(double) a1*a2*divide(1, 5);
     	 
     	 similitud = sim;

     	 return sim;*/

