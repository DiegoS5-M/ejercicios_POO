
package controlluces;


public abstract class Dispositivo {
    protected boolean estado;
    
    public Dispositivo (){
        this.estado = false;
        
        
    }
    public abstract void controlar ();

    public boolean  getEstado(){
        return estado;
        
    }
    }
    
    

