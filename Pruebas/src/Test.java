package src;
import  Proyecto2.*;
public class Test{


public static void main(String [] args){
     
        Integer [] numeracion = {50, 100, 75, 20, 60, 45, 35, 25, 48, 24, 74, 73, 65};
      ArbolRojinegro <Integer> ryb = new ArbolRojinegro <Integer>(numeracion);/**
        ryb.agrega(50);
        ryb.agrega(100);
        ryb.agrega(75);
	    ryb.agrega(20);
	    //System.out.println(ryb.getColor(raiz2()));
		ryb.agrega(60);
		ryb.agrega(45);
		ryb.agrega(35);
		ryb.agrega(25);
		ryb.agrega(48);
		ryb.agrega(24);
		ryb.agrega(74);
        ryb.agrega(73);
        ryb.agrega(65);*/
        //ryb.agrega("hola");
        //ryb.agrega("como");
        //ryb.agrega("estas");
		ryb.bfs( i -> System.out.println(i));
	   
		//ryb.dfs(1, i -> System.out.println(i));
		//ryb.dfs(2, i -> System.out.println(i));
		//ryb.dfs(3, i -> System.out.println(i));
        System.out.println();
        System.out.println();
        System.out.println(ryb.noElementos());
        //System.out.println("se eliminó ? "+ryb.elimina(45));
        //ryb.bfs( i -> System.out.println(i));
        //ryb.dfs(1, i -> System.out.println(i));
	    ArbolRojinegro <Componente> ryb2 = new ArbolRojinegro <Componente>();
        Componente c1 = new Componente("hola");
        Componente c2 = new Componente("como");
        Componente c3 = new Componente("esta");
        Componente c4 = new Componente("amig");

        ryb2.agrega(c1);
        ryb2.agrega(c2);
        ryb2.agrega(c3);
        ryb2.agrega(c4);

        ryb2.bfs( i -> System.out.println(i.getPalabra()));

        Componente c5 = ryb2.buscaVertice2(new Componente("hola"));
        //c5.setVeces();
         System.out.println("veces que aparece la palabra"+c5.getVeces());
        System.out.println(c5.getPalabra());
        Componente c6 = new Componente("amig");
        System.out.println(ryb2.existeVertice(c6));



    }





}