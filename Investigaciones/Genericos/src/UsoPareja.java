package Investigaciones.Genericos.src;
public class UsoPareja{

	public static void main (String [] args){

     Pareja <String> una = new Pareja <String>();

     una.setPrimero("Juan");

     System.out.println(una.getPrimero());

     Persona pers1 = new Persona ("Ana");

     Pareja <Persona> otra = new Pareja <Persona>();

     otra.setPrimero(pers1);
     System.out.println(otra.getPrimero());



	}



	
}