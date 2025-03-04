
package controltemperautra;

import java.util.concurrent.TimeUnit;

public class Principal {

    
    public static void main(String[] args) {
        
        invernadero Invernadero = new invernadero();
        
        System.out.println("similacion control temperatura...");
        
        while(true){
            
            Invernadero.controlarTemperatura();
        
        try {
            TimeUnit.SECONDS.sleep(5);
        }
            catch (InterruptedException e) {
        System.out.println(" Error en la simulación.");
          
    }
            
        }
    }
}

