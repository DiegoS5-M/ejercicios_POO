
package fizzbuzz;
import java.util.Scanner;

public class FizzJuego extends FizzBuzzBase  {
    public Scanner op = new Scanner(System.in);
    
public FizzJuego(){
   
    
}
    
    public void jugar(){
        char continuar;
        do{
            
        System.out.println("ingrese un numero del 1-100");
        
        while(!op.hasNextInt()){
                System.out.println("ingrese numero valido");
        op.next();
        }
        int leerNumero = op.nextInt();
        
            if ( leerNumero%3 == 0 && leerNumero %5 == 0 ){
                System.out.println("FizzBuzz");
                
            }
            else if ( leerNumero%3 ==0){
                System.out.println("Fizz");
                
            }
            else if ( leerNumero % 5 ==0){
                System.out.println("Buzz");
                
            }
            else{
                System.out.println(leerNumero);
                
                
            }
            System.out.println("seguir jugando? S/N");
            continuar = op.next().toUpperCase().charAt(0);
            
            
           }
        while (continuar == 'S');
        
    }
        }


    
    
    

