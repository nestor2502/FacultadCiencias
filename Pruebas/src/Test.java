package src;
public class Test{


public static void main(String [] args){
     
      ArbolRojinegro <Integer> ryb = new ArbolRojinegro <Integer>();
        ryb.agrega(50);
	    ryb.agrega(20);
	    //System.out.println(ryb.getColor(raiz2()));
		//ryb.agrega(60);
		ryb.agrega(45);
		ryb.agrega(35);
		ryb.agrega(25);
		//ryb.agrega(48);
		//ryb.agrega(24);
        
		ryb.bfs(i -> System.out.println(i));
	




}}