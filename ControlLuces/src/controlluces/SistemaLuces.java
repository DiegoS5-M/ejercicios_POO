
package controlluces;
import java.util.Random;

public class SistemaLuces extends Dispositivo{
    
    private boolean esNoche;
    private boolean hayMovimiento;

    public SistemaLuces(boolean esNoche) {
        super();
        
        this.esNoche = esNoche;
        this.hayMovimiento = false;
        
    }
    
    public void detectarMovimiento(){
        Random rr = new Random();
        this.hayMovimiento = rr.nextBoolean();
        
    }
    
    public void controlar(){
        if(esNoche && hayMovimiento){
            estado = true;
            
        }
        else {
            estado = false;
        }
        
        System.out.println("es noche : " + esNoche);
        System.out.println("movimiento : " + hayMovimiento);
        System.out.println("luces encendidas : " + getEstado());
        System.out.println("--------------------------");
    }
    
    
    
    
    
}
