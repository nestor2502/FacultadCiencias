 package Listas.src;


 import java.util.*;

public class PruebalinkedList{


   public static void main(String [] args){


     LinkedList<String> personas = new LinkedList<String>();

     //se agregan elementos a la lista

     personas.add("Nestor");

     personas.add("Pepe");

     personas.add("Isay");

     personas.add("Ana");

     personas.add("Laura");

     System.out.println(personas.size());

     ListIterator<String> it = personas.listIterator();

     it.next();//por default se va a encotrar en la primera posicion

     it.add("Juan");//se localiza este elemento entre la primera y segunda posicion del orden pasado
     //por lo  cual pasaria a ser el segundo elemento 


     for(String persona: personas){

     	 System.out.println(persona);
     }



}

}