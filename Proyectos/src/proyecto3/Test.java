package src;

/**
*Clase de pruebas
*@version 1.0
*/
public class Test{
     
     public static void main(String[] args) {
     	  System.out.println("Pruebas a base de datos");
     	  Base base = new Base();
     	  Usuario us = new Usuario("Nestor", "nestor2502", "correo", "1086");
     	  Usuario usa = new Usuario("Nestor Semer", "nestor2502", "correo", "10863");
     	  System.out.println();
     	  System.out.println();
     	  System.out.println("Existe el nombre nestor: "+base.existeNombreUsuario(us));
     	  System.out.println("Existe el correo: "+base.existeCorreo(us));
     	  System.out.println("Existe el Usuario: "+base.existeUsuario(us));
     	  base.agrega(us);
     	  if(base.existeNombreUsuario(us)||base.existeCorreo(us))
     	  	   base.getAdvertencias(usa);
     	  else
     	  base.agrega(usa);
     	  System.out.println();
     	  System.out.println();
     	  System.out.println("Existe el nombre nestor: "+base.existeNombreUsuario(us));
     	  System.out.println("Existe el correo: "+base.existeCorreo(us));
     	  System.out.println("Existe el Usuario: "+base.existeUsuario(us));
     	  

     }
}