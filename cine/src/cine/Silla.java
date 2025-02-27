
package cine;


public class Silla {
    
    private boolean ocupada;
    
    public Silla (){
        this.ocupada = false;
        
    }
    
    public boolean estaOcupada(){
        return ocupada;
        
    }
    
    public void ocupar(){
        this.ocupada = true;
    }
    
}
