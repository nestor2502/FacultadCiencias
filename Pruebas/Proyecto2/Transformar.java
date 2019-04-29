package Proyecto2;
import java.text.Normalizer;

/**
 * 
 * @author isayd
 *	Convierte las palabras del documento y del string a buscar en palabras agregables
 */
public class Transformar {
	/**
	 * Convierte un renglon del documento en una cadenas sin caracteres especiales, acentos o minusculas
	 * @param cadena
	 * @return String, cadena en minusculas, sin acentos ni simbolos especiales
	 */
	
	public static String convertir(String cadena){
		String texto = Normalizer.normalize(cadena, Normalizer.Form.NFKD);//Separa letras de acentos, etc
		texto = texto.replaceAll("[^a-zA-Z0-9 ]","");//borra todo lo que no sea una letra o numero o espacio
		texto = texto.toLowerCase();		//Todo lo vuelve minuscula
		return texto;						//Regresa la cadena en minusculas, sin acentos ni simbolos especiales
	}
	
	public static String[] arreglo(String cadena){
		String lovely = convertir(cadena);
		String [] array = lovely.split(" ");
		return array;
	}
}