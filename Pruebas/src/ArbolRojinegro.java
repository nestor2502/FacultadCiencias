package src;
import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Consumer;

public class ArbolRojinegro <T extends Comparable<T>>{

	 protected class VerticeRojinegro{
	   
	     public T elemento;
	     public VerticeRojinegro izquierdo;
	     public VerticeRojinegro derecho;
	     public VerticeRojinegro padre;
	     public Color color;
	
	     public VerticeRojinegro(T elemento){

         this.elemento = elemento;
         izquierdo = null;
         derecho= null;
         padre = null;  
         color = Color.ROJO;
	     }
     }

     public VerticeRojinegro raiz;
     protected int elementos;
     /**
     *Constructor que inicia un arbol binario
     */
     public ArbolRojinegro(){
	   
         raiz = null;
         elementos = 0;
    }
    /**
    *Constructor que inicia un arbol binario con un arreglo
    */
    public ArbolRojinegro(T[] a){
	  
         elementos = a.length;
         for(int i=0;i<a.length;i++) {
             agrega(a[i]);
         }  

    }


  
    public void agrega(T elemento){
    	 VerticeRojinegro nuevo = new VerticeRojinegro(elemento);

         if(raiz == null) {

             raiz = nuevo;
             //nuevoNodo.color = Color.NEGRO;
         } 
         else {

             VerticeRojinegro temporal = raiz;  
             //VerticeRojinegro padre = new VerticeRojinegro(null); 
             //Hacemos el recorrido para encontrar un lugar vacio
             while(temporal != null) {
                 nuevo.padre = temporal;
                 //padre= nuevo.padre;
                 if(elemento.compareTo(temporal.elemento)<= 0) {
                     temporal = temporal.izquierdo; 
                     //padre = temporal;         
                 }
             
                 else {
                     temporal = temporal.derecho; 
                     //padre = temporal;    
                 }           
             }
             //Vemos en donde vamos a ponerlo
             if(nuevo.elemento.compareTo(nuevo.padre.elemento)<=0) {
                 nuevo.padre.izquierdo = nuevo;
                 //nuevo.padre = padre;
              }
        
             else {
                 nuevo.padre.derecho = nuevo;
                 //nuevo.padre = padre;
                }
        
         }
         //VerticeRojinegro nes = (VerticeRojinegro )buscaVertice(elemento);
      rebalanceo(nuevo);
      elementos++;
	
    }

     public void conectaIzquierda(VerticeRojinegro padre, VerticeRojinegro hijo){ 
              
         if (padre != null ){

             if  (hijo == null )
         	     padre.izquierdo = null;

             if  (hijo != null ){
                 padre.izquierdo = hijo;

                 hijo.padre = padre;}

          }
     }

    public void conectaDerecha(VerticeRojinegro padre, VerticeRojinegro hijo){ 
     
       if (padre != null ){

             if  (hijo == null )
             padre.derecho = null;
         if  (hijo != null ){
             padre.derecho = hijo;

             hijo.padre = padre;}

         }

     }

     public void giraIzquierda(VerticeRojinegro u){

         if(u.derecho== null){
             return;
          }

          else if (u.derecho != null) {
            
            if(u.padre == null){
                u.derecho.padre = null;
                raiz = u.derecho;
             }
            else if(u.padre != null){


                 u.derecho.padre = u.padre;
                 VerticeRojinegro dad = u.padre;
                 if(dad.izquierdo == u){

                 dad.izquierdo = u.derecho;

                 }
                 if(dad.derecho == u){

                 dad.izquierdo = u.derecho;
                 }
                 //if(u.izquierdo != null)
                 //u.izquierdo.padre = dad;

            }
            
            
             VerticeRojinegro aux = u.derecho;
             u.padre = u.derecho;

             conectaDerecha(u, aux.izquierdo);
            
             if(aux.izquierdo != null )
             aux.izquierdo.padre = u;
             conectaIzquierda(aux, u);
             
          }
     }

     public void giraDerecha(VerticeRojinegro u ){
         
         if(u.izquierdo == null){

            return ;
         }

         else if(u.izquierdo != null){

             if(u.padre != null){

                u.izquierdo.padre = u.padre;
                VerticeRojinegro dad = u.padre;

             if(dad.izquierdo == u){

                 dad.izquierdo = u.izquierdo;

             }
             if(dad.derecho == u){
                 //se cambio
                 dad.derecho = u.izquierdo;
                 //u.izquierdo.padre = dad;
             }

             //if(u.derecho != null)
               //  u.derecho.padre = dad;


         }
             if(u.padre == null){
                u.izquierdo.padre = null;
                raiz = u.izquierdo;
             }
             VerticeRojinegro aux = u.izquierdo;
             u.padre = u.izquierdo;
             conectaIzquierda(u,aux.derecho );
             
               if(aux.derecho != null )
             aux.derecho.padre = u;
             conectaDerecha(aux, u);
            
           

         }

     }


     public VerticeRojinegro getTio(VerticeRojinegro v){
     
     VerticeRojinegro ve  = v;

     if(v.padre.padre.izquierdo==v.padre){
        if(v.padre.padre.derecho!=null)
         ve = v.padre.padre.derecho;

        if(v.padre.padre.derecho==null)
         ve =  null;
     }

     else if(v.padre.padre.derecho==v.padre){
        if(v.padre.padre.izquierdo!=null)
         ve =  v.padre.padre.derecho;

        if(v.padre.padre.izquierdo==null)
         ve =  null;
      }

     return ve;
        
    }
    public VerticeRojinegro getAbuelo(VerticeRojinegro v){

        return v.padre.padre;
    }


    public void rebalanceo(VerticeRojinegro v){

         //if(v instanceof ArbolRojinegro.VerticeRojinegro){

     // Caso 1

         if(v.padre == null){

          v.color = Color.NEGRO;

          return;
         }
     
          else if(v.padre != null){

             VerticeRojinegro p = v.padre;

     //Caso 2

             if(p.color== Color.NEGRO){

                return ;
             }

         //Caso 2.1
                VerticeRojinegro a= new VerticeRojinegro(v.elemento);
                VerticeRojinegro t= new VerticeRojinegro(v.elemento);
              //p rojo, hay abuelo (a) y un tio(t)
              /**
             if(p.color== Color.ROJO){
                  a = (VerticeRojinegro)v.padre.padre;

             if(v.padre.padre.izquierdo == v.padre)  

                  t = (VerticeRojinegro)v.padre.padre.derecho;

             if(v.padre.padre.derecho == v.padre)
                 t = (VerticeRojinegro)v.padre.padre.izquierdo;*/
                 a = getAbuelo(v);
                 t = getTio(v);

     //Caso 3
             if(t!= null){
             if(t.color == Color.ROJO){

                //coloreamos a t y p de negro y a de rojo

                 p.color = Color.NEGRO;
                 t.color = Color.NEGRO;
                 a.color = Color.ROJO;

                 rebalanceo(a);
                 return;

             }}
     
         //Caso 3.1 t es negro o es dstinto a null

             if(t == null || t.color == Color.NEGRO ){

     //Caso 4

             // v y p estan cruzados, 1.- izquierdo, 2.- derecho
             
             int direccionP=0;
             int direccionV=0;

             if(v.padre.padre.izquierdo == v.padre)  
                 direccionP = 1;
             

             if(v.padre.padre.derecho == v.padre)
                 direccionP = 2;

             if(v.padre.izquierdo == v)  
                 direccionV = 1;
             

             if(v.padre.derecho == v)
                 direccionV = 2;
             
             // si u y v estan cruzados

             if(direccionV != direccionP){

                 if(direccionP==1){
                     giraIzquierda(p);
                 }

                 if(direccionP==2){
                     giraDerecha(p);
                 }

                 //se regresan a su posicion solo los vertices

                 VerticeRojinegro temp = v;

                 v= p;
                 p= temp;

                 if(v.padre.padre.izquierdo == v.padre)  
                 direccionP = 1;
             

                 if(v.padre.padre.derecho == v.padre)
                 direccionP = 2;

                 if(v.padre.izquierdo == v)  
                 direccionV = 1;
             

                 if(v.padre.derecho == v)
                 direccionV = 2;



             } 
     
     //Caso 5
            //VerticeRojinegro p = v;
            //VerticeRojinegro v = v;

            
             if(direccionV == direccionP){

                 p.color = Color.NEGRO;
                 a.color = Color.ROJO;

                 //giramos en direccion contraria de v

                 if(direccionV == 1){
                      giraDerecha(a);
                 }

                 if(direccionV == 2){
                      giraIzquierda(a);
                 }
             return;
             }
             }
         }


    }




      public void bfs(Consumer<T> funcion){
    	
	
      bfs2(funcion, raiz);
  
    }

     public void bfs2(Consumer<T> funcion, VerticeRojinegro x){

    	 Queue<VerticeRojinegro> cola = new LinkedList<VerticeRojinegro>();
	     cola.add(x);
	
	     while(!cola.isEmpty()) {
		 VerticeRojinegro vertice = cola.remove();
		 funcion.accept(vertice.elemento);
		 if(vertice.izquierdo != null) {
			 cola.add(vertice.izquierdo);
		 }
		
		 if(vertice.derecho != null) {
			 cola.add(vertice.derecho);
		 }
	}
	     
    }


    public void dfs(int tipo, Consumer<T> funcion) throws IllegalArgumentException{
	       
        switch(tipo){

             case 1: preOrden(funcion, raiz);
 
                 break;

             case 2: inOrden(funcion, raiz);

                 break; 

             case 3:  postOrden(funcion, raiz); 

                  break; 

             default: throw new IllegalArgumentException(); 
        }


    }

    public void preOrden(Consumer<T> funcion, VerticeRojinegro x ){


        
         if(x != null) {
             funcion.accept(x.elemento);
             preOrden(funcion, x.izquierdo);
             preOrden(funcion, x.derecho);
    }




    }

    public void inOrden(Consumer<T> funcion, VerticeRojinegro x ){

         if(x != null) {
         inOrden(funcion , x.izquierdo);
         funcion.accept(x.elemento);
         inOrden(funcion, x.derecho);
         
    }


    }

    public void postOrden(Consumer<T> funcion, VerticeRojinegro x){

         if(x != null) {
         postOrden(funcion, x.izquierdo);
         postOrden(funcion, x.derecho);
         funcion.accept(x.elemento);
    }
    }




	      

}