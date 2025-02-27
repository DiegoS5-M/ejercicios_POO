
package cine;


public class Sala {
    private String nombreSala;
    private int capacidad;
    private Silla[] sillas;
    
    
    public Sala(String nombreSala , int capacidad  ){
        this.nombreSala = nombreSala;
        this.capacidad = capacidad;
        
        this.sillas = new Silla[capacidad];
        
        for (int i=0;i<capacidad;i++){
            sillas[i] = new Silla();
            
        }
           
        }
    public boolean reservarAsiento(){
        for(int i=0;i<capacidad;i++){
            if(!sillas[i].estaOcupada()){
                sillas[i].ocupar();
                return true;
            }
        }
        return false;
        
    }
    
    public void mostrarDisponibilidad(){
        int disponibles = 0;
        for ( int i=0;i< sillas.length;i++){
            if(!sillas[i].estaOcupada()){
                disponibles++;
                
            }
            
        }
        System.out.println("sala " + nombreSala + "- asientos disponibles " + disponibles);
    }
    
    
    
    
    
}
