package lectura;
import java.io.*;


public class Buffer{


	  public static void main(String[] args) {
	  	Leer obj= new Leer();

	  	obj.leer();
	  	
	  }
}

class Leer {

	  public void leer(){

	  try{
        String ruta = "/home/nestor2502/Escritorio/ejemplo.txt";
	  	FileReader entrada = new FileReader(ruta);
        BufferedReader mibuffer = new BufferedReader(entrada);


	  	String linea="";
        System.out.println();
	  	while (linea!=null) {

	  		 linea = mibuffer.readLine();
             if(linea!=null)
	  		 System.out.println(linea);
	  		
	  	}
	  	entrada.close();

	  	System.out.println();

	  }
	  catch(IOException e){

	  	  System.out.println("No se encuentra el archivo");
	  }
	}
}