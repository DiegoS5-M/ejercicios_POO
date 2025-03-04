
package sistemaseguridad;
import java.util.Random;


public class SensorMovimiento extends SensorBase{
    
    Random op = new Random();
    
    public SensorMovimiento() {
    }
    
    public boolean detectarMovimiento(){
        movimiento = op.nextBoolean();
        return movimiento;
        
    }
    
    
}
