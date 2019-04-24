package src;
public class Test{


public static void main(String [] args){
     
      ArbolRojinegro <Integer> ryb = new ArbolRojinegro <Integer>();
        ryb.agrega(50);
        ryb.agrega(100);
        //ryb.agrega(75);
	    //ryb.agrega(20);
	    //System.out.println(ryb.getColor(raiz2()));
		//ryb.agrega(60);
		//ryb.agrega(45);
		//ryb.agrega(35);
		//ryb.agrega(25);
		//ryb.agrega(48);
		//ryb.agrega(24);
		//ryb.agrega(74);
        //ryb.agrega(73);
        //ryb.agrega(65);
        //ryb.agrega("hola");
        //ryb.agrega("como");
        //ryb.agrega("estas");
		ryb.bfs( i -> System.out.println(i));
	
		//ryb.dfs(1, i -> System.out.println(i));
		//ryb.dfs(2, i -> System.out.println(i));
		//ryb.dfs(3, i -> System.out.println(i));
        System.out.println();
        System.out.println();
        System.out.println();
        //System.out.println("se eliminó ? "+ryb.elimina(45));
        //ryb.bfs( i -> System.out.println(i));
        //ryb.dfs(1, i -> System.out.println(i));
	




}}