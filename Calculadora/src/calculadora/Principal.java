
package calculadora;
import java.util.Scanner;


public class Principal {


    
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        
        boolean continuar = true;
        
        while(continuar){
            
            System.out.println("Bienvenido a Calculadora");
            System.out.println("1. inicar calculadora");
            
            int opcion = op.nextInt();
            
            switch (opcion) {
                case 1:
                    
                    calculadoraBase calcu = new calculadora();
                    calcu.calcular();
                    
                    break;
                
                        
                default:
                    System.out.println("ingrese opcion valida");
            }
        }
        
        
        
        
        
        
    }
    
}
