package src;

/**
*Clase con los datos de un usario
*@author nestor vazquez 
*/
public class Usuario{

     private String nombre;
     private String usuario;
     private String correo;
     private String contraseña;
     private String antecedentes;
     private double saldo =0;
     private String llave;

     
     public Usuario(String nombre, String usuario, String correo , String contraseña){

     	    this.nombre = nombre;
     	    this.usuario = usuario;
     	    this.correo = correo;
     	    this.contraseña= contraseña;
     	    llave= usuario.concat(contraseña);

     }
     
     /**
     *Metodo que devuelve el nombre
     *@return nombre
     */
     public String getNombre(){
         return nombre;	
     }
     
     /**
     *
     *metodo que retorna el usuario
     *@return usuario
     */
     public String getUsuario(){
     	return usuario;
     }

     /**
     *Metodo que retorna el correo
     *@return correo
     */
     public String getCorreo(){
     	return correo;
     }
     /**
     *Metodo que retorna la contraseña
     *@return contraseña
     */
     public String getContraseña(){
     	return contraseña;
     }
     
     /**
     *Metodo que modifica el saldo
     *@param saldo
     */
     public void setSaldo(int saldo){
     	this.saldo = saldo;
     }

     /**
     *Metodo que retorna el saldo
     *@return saldo
     */
     public double getSaldo(){
     	return saldo;
     }
      
      @Override
    public boolean equals(Object t){
           boolean ig = false;
           if(t instanceof Usuario){
           Usuario g = (Usuario)t;
           if(usuario.equals(g.usuario) && correo.equals(g.correo))
             ig = true; }

         return ig;   
    }


}
