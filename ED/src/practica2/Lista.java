
import java.util.Iterator;
import java.util.NoSuchElementException;


/**
 * Implementación de listas ligadas.
 */
public class Lista<T> implements Iterable<T>{

    ////////////////////////////////////////////////////////////////

    // Clase interna para representar los nodos de nuestras listas.
    private class Nodo{
	
	public T elemento;
	public Nodo siguiente;
	public Nodo anterior;
	
	public Nodo(T elemento){
	    // Aquí va su código.
	}
    }


///////////////////////////////////////////////////////////////////////


    // Clase para iterar la lista.
    private class Iterador implements Iterator<T>{

	public Nodo siguiente;

	public Iterador(){
	    // Aquí va su código.
	}

	@Override
	public boolean hasNext(){
	    // Aquí va su código.
	}
	
	@Override
	public T next(){
	    // Aquí va su código.
	}
    }
//////////////////////////////////////////////////////////////////////////


    private Nodo cabeza;
    private Nodo ultimo;
    private int longitud;
    
    /**
    *Constructor vacio
    */
    public Lista(){
	// Aquí va su código.
    }


    /**
    *Constructor que toma un arreglo y mete sus elementos a la lista 
    */
    public Lista(T[] arreglo){
	// Aquí va su código.
    }
    

    /**
    *Regresa el primer elemento de la lista
    */
    //si la lista es vacía, deben lanzar una NoSuchElementException.
    public T getPrimero(){
	// Aquí va su código.
    }

    /**
    *Regresa el ultimo elemento de la lista, 
    */
    //si la lista es vacía, deben lanzar una NoSuchElementException.
    public T getUltimo(){
        // Aquí va su código.
    }
    

    /**
    *Elimina el primer elemento de la lista, si la lista es vacia 
    */
    //debe lanzar NoSuchElementException
    public T eliminaPrimero(){
	// Aquí va su código.
    }
    

    /**
    *Elimina el ultimo elemento de la lista, si la lista es vacia 
    */
    //debe lanzar NoSuchElementException
    public T eliminaUltimo(){
	// Aquí va su código.
    }
    

    /**
    *Recibe un elemento y lo agrega al inicio de la lista
    */
    public void agregaInicio(T t){
	// Aquí va su código.
    }
    

    /**
    *Recibe un elemento y lo agrega al final de la lista
    */
    public void agregaFinal(T t){
	// Aquí va su código.
    }
    

    /**
    *Recibe un elemento, si el elemto se encuentra en la lista devuelve true
    *si no false 
    */
    public boolean contiene(T t){
	// Aquí va su código.
    }
    

    /**
    *regresa la longitud de la lista
    */
    public int getLongitud(){
	// Aquí va su código.
    }
    

    /**
    *Recibe un elemento y elimina su primera ocurrencia en la lista,
    *devuelve true si el elemento se eliminó, false en otro claso
    */
    public boolean elimina(T t){
	// Aquí va su código.
    }
    

    /**
    *Vacía la lista
    */
    public void limpia(){
	// Aquí va su código.
    }
    

    /**
    *Este método toma un índice i y regresa el i-ésimo elemento de la lista.
    */
    //Deben lanzar una IndexOutOfBoundsException si el índice es menor a 0 o mayor o igual al tamaño de la lista.
    public T get(int indx){
	// Aquí va su código.
    }
    

    /**
    *Toma un índice i y un elemento y mete el elemento en la posición i de la lista.
    //
    */
    public void inserta(int indx, T t){
	// Aquí va su código.
    }
    

    /**
    *Este método nos regresa un arreglo con los mismos elementos de nuestra lista en el mismo orden.
    */
    public Object[] toArray(){
	// Aquí va su código.
    }
    

    /**
    *Este método nos regresa una lista con los elementos de nuestra lista en orden inverso. 
    */
    public Lista<T> reversa(){
	// Aquí va su código.
    }

    

    /**
    *Este método nos regresa una copia de nuestra lista.
    */
    public Lista<T> copia(){
	// Aquí va su código.
    }


    /**
    *El método regresa una cadena con la información de nuestra lista.
    */
    @Override
    public String toString(){
       	// Aquí va su código.
    }

    /**
    *Deben regresar true si el objeto recibido es igual a la lista y false en otro caso.
    */
    @Override
    public boolean equals(Object o){
      	// Aquí va su código.
    }


    /**
    *Este método pertenece a la interfaz Iterable
    */
    @Override
    public Iterator<T> iterator(){
	// Aquí va su código.
    }
}
