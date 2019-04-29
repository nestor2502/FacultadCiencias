package Proyecto2;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Textos{

	//Atributo que tiene la direccion del documento
	public String documento;
	public String completa;
	public String[] concat;
	//Constructor 
	public Textos(String ruta){
		documento = ruta;
		completa = "";
	}
	
	/**Metodo que agrega al arbol, agarra cierto documento
	 * 
	 */
	public String[] agregation() {
	try {
		BufferedReader lector = new BufferedReader(new FileReader(documento));//Se usa para leer los documentos
//		ArbolAvl<String> avl = new ArbolAvl<String>(); //Creamos con el arbol
		String cadena;
		while((cadena = lector.readLine()) != null){
			if(completa == "")
			completa = cadena.trim();
			else	
			completa = completa + " " + cadena.trim();
//Esta parte funciona			
			/**
			cadena = Transformar.convertir(cadena);// Metodo que convierte el renglon en minusculas
			String [] subcadena = Transformar.arreglo(cadena);// Divide nuestro string en palabras y los mete a un arreglo
			for(String i : subcadena){
				//Aqui va el agrega al arbol
				System.out.println(i);
				//avl.agrega(i);
			}
			*/
	}
		lector.close();
		completa = Transformar.convertir(completa);
		String[] subcadena = Transformar.arreglo(completa);
		return subcadena;
	}catch(FileNotFoundException e){//No encontro el documento
		
		System.out.println("No se encontro el documento");
		
	}catch(IOException e){//Errores varios
		
		System.out.println("Hubo algun problema");
	
	}
	return null;
}
	
/**	
	public static void main(String [] args){
		Textos txt = new Textos("C:\\Users\\isayd\\Documents\\prueba.txt");
		String[] nio = txt.agregation();
		for(String i: nio)
			System.out.println(i);
		
	}
*/
}