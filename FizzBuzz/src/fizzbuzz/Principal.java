
package fizzbuzz;
import java.util.Scanner;

public class Principal {

    
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        
        boolean continuar =  true;
        
        System.out.println("bienvenido a FizzBuzz");
            System.out.println("1 jugar");
            System.out.println("2 salir del juego");
            int opcion= op.nextInt();
        while(continuar){
            
            
            switch (opcion) {
                case 1:
                    FizzJuego juego = new FizzJuego();
                    juego.jugar();
                    
                    break;
                    
                case 2 : 
                    System.out.println("gracias por visitarnos");
                    break;
                    
                default:
                    System.out.println("asigne opcion valida");
            }
        
        
        
        }
    }
    
}
