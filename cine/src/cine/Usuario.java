
package cine;


public class Usuario extends Persona {
    
    private String idUsuario;

    public Usuario(String nombre, int edad , String idUsuario) {
        super(nombre, edad);
        this.idUsuario = idUsuario;
        
    }
    
    public String getIdUsuario(){
        return idUsuario;
        
    }
    
    public void setIdUsuario(String idUsuario){
        this.idUsuario = idUsuario;
        
    }
    
    
    
    public void mostrarInformacion(){
        System.out.println("usuario " + getNombre() + ", edad " + getEdad() + " id usuario " + getIdUsuario());
    }
    
    
}  


