package src.practica1;


/**
*@author Nestor Semer Vazquez Cordero
*@author Isay Balderas Salomon
*@version 1.0
*Clase que implementa un subconjunto de metodos de la clase String
*
*/

public class MyString {

	public  char [] caracteres;


	/** Constructor para generar una cadena vacia */

	 public MyString(){
	 	caracteres = new char [] {0};

	  } 

	/** Constructor a partir de un string */

	 public MyString (String cadena){

		 int longitud = cadena.length();

		 caracteres = new char [longitud];

		 for(int i = 0 ; i < longitud ; i++){

		 	 caracteres [i] = cadena.charAt(i);
		 }
     
       

	  }

	/** Constructor a partir de un arreglo de caracteres */

	 public MyString (char [] caracteres){

	 	 int cont =0;

         this.caracteres = new char[caracteres.length+1]; //+1 para que cree un espacio vacío en el arreglo

         for(int i=0 ; i < caracteres.length; i++){
           
             this.caracteres[i]= caracteres[i];

             cont++;

             }

	  }
     
     /**
     *
     *Metodo que devuelve un string con los mismos caractyeres que nuestra cadena
     *
     *@return concat_string
     *
     */
	 @Override
      public String toString(){
        String concat_string="";
	      for(int i=0;i<caracteres.length;i++){
		      concat_string += caracteres[i];
	      }
	      return concat_string;
}
     /**
     *
     *Metodo que recibe un indice i y nos regresa un MyString con los caracteres del intervalo [i, longitud-1]
     * de la cadena original
     *@param index
     *@return concat_string
     *
     */
        
     public String subString (int index){
String concat_string = "";
	     if(index<0){
			return "";
	     }
	     else if(index>caracteres.length){
		     return "";
     	     }
	     else{
		    for(int i=index;i<caracteres.length;i++){
			    concat_string += caracteres[i];
		    }
		     return concat_string;
	     }
     }

     /**
     *
     *Toma un indice i y nos regresa el caracter en la posicion i de nuestra cadena
     *@param indice
     *@return caracter
     *@throws IndexOutOfBoundsException
     *
     */
     public char charAt( int index) throws IndexOutOfBoundsException{
      
         char caracter = ' ';


        // try{  

         	 for (int i =0 ; i < this.caracteres.length; i++){

                if (this.caracteres.length < index || index < 0){

                throw new IndexOutOfBoundsException();

                }

         	 	 else {
                     
                     caracter = this.caracteres [index];

         	 	} return caracter; 
         	 }


           //  }
         
         //catch( IndexOutOfBoundsException e ){

          //   System.out.println("El indice no fue encontrado");

          //   }
             

         return ' ';
     }

     /**
     *
     *Metodo que nos dice si dos objetos son iguales
     *
     */
     public void equals ( String cadena){}

     /**
     *
     *Metodo que devuelve true cuando la cadena recibida es sufijo de la nuestra
     *@param Mystring
     *@return boolean
     *
     */
     public boolean endsWith ( MyString cadena){

        int cont =0;
        int j =0;
        char[] nuevo = cadena.caracteres;
        if(nuevo.length > caracteres.length)

             return false;

        for (int i=0;i<caracteres.length;i++){

             if(caracteres[i]==nuevo[j]){
                
                cont++;
                j++;
            }
         }

         if(cont>=1)

             return true;
        
         else

             return false;
        
     }

     /**
     *
     *Metodo que quita espacios alrededor de nuestra cadena
     *@param string
     *@return cadena
     *
     */
     public char[] trim(){

     int cont1=0;
     int cont2=0;   
     int []  car = new int[caracteres.length];
     char [] nuevo;

     for(int i = 0;i<caracteres.length; i++){

         car[i]=(int)caracteres[i];
  
         }

     for(int i =0; car[i] <= 33; i++ ){

         cont1++;
     }

     for(int i = (car.length-1); car[i] <= 33; i-- ){
 
         cont2=i;
     }
     
     int total = cont2 - cont1;

     

     nuevo = new char [total];

     for(int i=cont1; i< nuevo.length; i++){

         nuevo [i-cont1]=(char)car[i];
     
    }
     //String espa = String.valueOf(nuevo);
     return nuevo;
     }

     /**
     *
     *Metodo que toma un caracter y nos regresa la primera posicion en la que dicho caracter aparece
     *@param caracter
     *@return posicion
     *
     */
     public int indexOf( char caracter){
            
         for(int i =0 ; i < caracteres.length; i++){

         	 if( caracteres [i] == caracter ){
                 
                 return i;

         	 }

         }
         	
         return -1; 

     }

     /**
     *
     *Metodo que devuelve un string con los miosmos caractyeres que nuestra cadena
     *@param string
     *@return cadena
     *
     */
     public String concat( String cadena){
        String hola = " ";
        return hola;
     }

     /**
     *
     *Metodo que devuelve un string con los miosmos caractyeres que nuestra cadena
     *@param string
     *@return cadena
     *
     */
     public boolean isEmpty(){

     	int cont = 0;

     	for (int i = 0; i < caracteres.length; i++){

     		 if( caracteres [i] == 0)
     		 	 cont ++;

     		 }

         if (cont == caracteres.length)
             return true;

         else
             return false; 


     	}
     

     /**
     *
     *Metodo que nos regrese la longitud de nuestra cadena.
     *@param string
     *@return cadena
     *
     */
     public int length (){
     
         int tamaño =0;

         for(int i=0;caracteres[i]!= 0 ; i++){
    
             tamaño++;   

             }
        
         return tamaño  ;

      }





     public static void main (String [] args ){

	  char [] cadena = new char [7];
	  cadena[0]=' ';
	  cadena[1]='i';
	  cadena[2]='a';
	  cadena[3]='n';
	  cadena[4]='a';
	  cadena[5]='h';
	  cadena[6]=' ';

      char[] cadena2 = new char[3];
      cadena2[0]=' ';
      cadena2[1]='i';
      cadena2[2]='a';
      
      //entra como parametro arreglo de caracteres
	  MyString obj = new MyString(cadena); 
      MyString obj3 = new MyString(cadena2);

	  
	  int longitud = obj.length();

      char caracter = obj.charAt(6);

      String caden = obj.toString();

      String sub = obj.subString(3);

      boolean sufijo = obj.endsWith(obj3);

      char[] hol = obj.trim();

      MyString obj2 = new MyString(hol);

      



      
      String espa = obj2.toString();
      int inde = obj.indexOf('a');

      boolean emp = obj.isEmpty();

      for(int i=0; i<cadena.length;i++){
          
         System.out.println(cadena[i]);

      }
	 
      System.out.println("Metodo toString: "+caden);
      System.out.println("metodo subString(3): "+ sub);
      System.out.println("Caracter en la posicion 6: "+caracter);
      System.out.println("metodo equals: ");
      System.out.println("metodo endsWith: "+sufijo);
      System.out.println("metodo trim: "+espa);
      System.out.println("Metodo indexOf de 'a': "+ inde);
      System.out.println("metodo concat: ");
      System.out.println("la cadena es vacia: "+ emp);
	  System.out.println("Longitud: "+longitud);

      
      
 
	}
 
 }
