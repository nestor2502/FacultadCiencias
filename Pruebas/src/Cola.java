package src;

import java.util.NoSuchElementException;
import java.util.Iterator;

     /**
     *@author Nestor Semer Vazquez Cordero
     *@author Isay Balderas Salomon
     *@version 2.0
     *Clase que implementa una cola
     *
     */
public class Cola<T> implements Iterable<T>{

    Lista <T> cola;

    public Cola(){
	
    cola = new Lista <T>();

    }
    
    public Cola(Lista<T> l){
	     
	     cola=l;
    }
    
    public Cola(T[] arreglo){
	cola= new Lista  <T> (arreglo);
    }

    public boolean esVacia(){

	     if (cola.getLongitud()>0)
             return false;
      
         else
             return  true;

    }

    public T mira(){
	
     return cola.getPrimero();
    }

    public T saca(){
	
    
    return cola.eliminaPrimero();
    }

    public void mete(T t){
	
         cola.agregaFinal(t);
    }

    @Override
    public String toString(){
	 

        return cola.toString();
    }

    @Override
    public boolean equals(Object o){
	 
     return cola.equals(o);
    }

    @Override
    public Iterator<T> iterator(){
	
    return cola.iterator();
    }
}
