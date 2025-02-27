
package cine;
import java.util.Scanner;

public class Principal {

    
    public static void main(String[] args) {
       Scanner op = new Scanner(System.in);
        
           
           
       
       
       Sala sala1 = new Sala("sala 1 ", 5);
        System.out.println("bienvenido, continua con la reserva");
       
        boolean continuar = true;
        while(continuar){
            System.out.println("menu");
            System.out.println("1 reservar asciento ");
            System.out.println("2 ver disponibilidad");
            System.out.println("3 salir");
            System.out.println("seleccione opcion ");
            int opcion = op.nextInt();
            
            
            switch (opcion) {
                case 1: 
                    System.out.println("ingrese su nombre");
                    String nombre = op.next();
                    
                    System.out.println("ingrese su edad");
                    int edad = op.nextInt();
                    
                    op.nextLine();
                    System.out.println("ingrese su id usuario");
                    String id = op.next();
                    
                    Usuario usuario = new Usuario(nombre,edad,id);
                    usuario.mostrarInformacion();
                    
                    if (sala1.reservarAsiento())
                        System.out.println("reserva exitosa");
                    else {
                        System.out.println("lo sentimos, sala llena");
                    }
                    
                    break;
                    
                case 2 : sala1.mostrarDisponibilidad();
                break;
                
                    
                case 3 : 
                    continuar =  false;
                    System.out.println("gracias por visitarnos");
                    break;
                    
                default:
                    System.out.println("opcion invalida");
            }
            
        }
    }
    
}
