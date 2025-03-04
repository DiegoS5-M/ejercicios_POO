
package sistemaseguridad;


public class Alarma {
    private SensorMovimiento[] sensores;// array  
    private boolean alarmaActiva;
    private boolean esNoche;
    
    public Alarma (boolean esNoche){
        this.sensores = new SensorMovimiento[3];// 3 sensores
        
        for ( int i =0; i< sensores.length; i++){
        sensores [i] = new SensorMovimiento();
        
        
    }
        this.alarmaActiva = true;
        this.esNoche = esNoche;
        
    }
    
    public void  verificarSistemaa(){
        if(!alarmaActiva){
            System.out.println("la alarma esta desactivada");
            return;
            
        }
        int sensoresDetectando = 0;
        
        for (SensorMovimiento sensor : sensores) {
            if (sensor.detectarMovimiento()) {
                sensoresDetectando++;
    }
    
}
        System.out.println("sensores sactivados " + sensoresDetectando + "/3");
        
        if(sensoresDetectando >= 2 && esNoche){
            System.out.println("alarma activada");
            
        }
        else {
            System.out.println("no hay amaneza");
        }
        
    }
    
    public void alarmaActivada(){
        alarmaActiva = true;
        System.out.println("alarma activa");
        
        
    }
    public void alarmaDesactivada(){
        alarmaActiva = false;
        System.out.println("alarma desactivada");
    }
}