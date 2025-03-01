
package calculadora;


public abstract class calculadoraBase {
    
    private double num1;
    private double num2;
    private char operacion;
    
    public double getNum1(){
        return num1;
        
    }
    public double getNum2(){
        return num2;
        
    }
    
    public void setNum1(double num1 ){
        this.num1 = num1;
        
    }
    
    public void setNum2(double num2){
        this.num2 = num2;
        
    }
    
    public char getOperacion(){
        return operacion;
        
    }
    
    public void setOperacion(char operacion){
        this.operacion = operacion;
        
    }
            
            
public abstract void calcular();
    
    
    
}
