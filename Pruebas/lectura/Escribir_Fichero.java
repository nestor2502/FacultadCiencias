package lectura;
import java.io.*;


public class Escribir_Fichero{


	  public static void main(String[] args) {
	  	Leer2 obj= new Leer2();

	  	obj.leer();
	  	
	  }
}

class Leer2 {

	  public void leer(){

	  try{
        String ruta = "/home/nestor2502/Escritorio/ejemplo.txt";
	  	FileReader entrada = new FileReader(ruta);
	  	int c = 0;
        System.out.println();
	  	while (c!=-1) {

	  		 c = entrada.read();
	  		 char letra = (char)c;

	  		 System.out.println(letra);
	  		
	  	}
	  	entrada.close();

	  	System.out.println();

	  }
	  catch(IOException e){

	  	  System.out.println("No se encuentra el archivo");
	  }
	}
}