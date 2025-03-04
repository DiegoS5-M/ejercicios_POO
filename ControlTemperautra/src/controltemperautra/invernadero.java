
package controltemperautra;


public class invernadero {
    
    private SensorTemperatura sensor;

    public invernadero() {
        this.sensor =new  SensorTemperatura();
    }
    
    public void controlarTemperatura(){
        double tempActual = sensor.medirTemperatura();
        System.out.printf(" Temperatura actual: %.2f°C\n " , tempActual);
        
        if(tempActual < 10){
            System.out.println("activando calefactor");
        }
        else if ( tempActual > 25){
            System.out.println("activando ventilador");
            
        }
        else{
             System.out.println("temperatura estable...");
             
             
        }
    }
    
}
