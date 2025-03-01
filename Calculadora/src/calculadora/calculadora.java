
package calculadora;
import java.util.Scanner;

public class calculadora extends calculadoraBase {
    Scanner op = new Scanner(System.in);

    public calculadora() {
    }
    
    private void solicitarDatos(){
        System.out.println("ingrese num 1");
        while(!op.hasNextDouble()){
            System.out.println("ingrese num valido");
        }
        setNum1(op.nextDouble());
        
        System.out.println("ingrese segundo numero");
        while(!op.hasNextDouble()){
            System.out.println("invalido, ingrese numero valido");
            
        }
        
        setNum2(op.nextDouble());
        
        
        System.out.println("ingrese la operacion a realizar (+ - * /)");
        setOperacion(op.next().charAt(0));
    }
    private double realizarOperacion(){
        switch (getOperacion()){
            case '+' : 
                return getNum1() + getNum2() ;
                
        
        
        case '-' : 
        return  getNum1() - getNum2();
        
        case '*' : 
            return getNum1() * getNum2();
            
        case '/' :
            
            if (getNum2() == 0){
                System.out.println("no se puede dividir por 0");
                return 0;
            }
            return getNum1() / getNum2();
            
        default :
            System.out.println("operacion invalida ");
            return 0;
        
        
        
    }
    }
    
    public void calcular(){
        char continuar ;
        do{
            solicitarDatos();
            double resultado = realizarOperacion();
            
            if (resultado != Double.MIN_VALUE) {
            System.out.println("resultado : " + resultado);
            }
            System.out.println("desea realizar otra operacion? (S/N)");
            continuar = op.next().toUpperCase().charAt(0);
        }
            while ( continuar =='S');
        
        
        
        
        }
    }
    

        
   


