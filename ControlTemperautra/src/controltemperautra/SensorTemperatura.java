
package controltemperautra;
import java.util.Random;



public class  SensorTemperatura extends SensorBase {
    Random op = new Random();
   

    public SensorTemperatura() {
    }
   
    public double medirTemperatura(){
       temperatura = 5 + (op.nextDouble()* 30);
       return temperatura;
       
    
   
    }
   
       
       
   }
   

