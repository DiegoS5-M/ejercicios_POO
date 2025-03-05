
package controlluces;
import java.util.concurrent.TimeUnit;


public class Principal {

    
    public static void main(String[] args) {
        SistemaLuces sistema = new SistemaLuces(true);
        
        while (true){
            sistema.detectarMovimiento();
            sistema.controlar();
            
            
            try {
                TimeUnit.SECONDS.sleep(10);
                     
            }
            catch(InterruptedException e ){
                System.out.println("error ");
                break;
            }
            
            
        }
        
        
    }
    
}
