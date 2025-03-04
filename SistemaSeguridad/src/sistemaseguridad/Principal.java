
package sistemaseguridad;
import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("es de noche? (true/false)");
        boolean esNoche = op.nextBoolean();
        
        Alarma sistema = new Alarma(esNoche);
        int opcion;
        
        do{
            System.out.println("MENU SEGURIDAD");
            System.out.println("1. verificar sistema");
            System.out.println("2. activar alarma");
            System.out.println("3. desactivar alarma");
            System.out.println("4.salir");
            System.out.println("seleccione opcion");
            opcion = op.nextInt();
            
            switch (opcion) {
                case 1:
                    sistema.verificarSistemaa();
                    
                    break;
                case 2 :
                    sistema.alarmaActivada();
                    break;
                case 3 : 
                    sistema.alarmaDesactivada();
                    break;
                case 4 :
                    System.out.println("saliendo del sistema...");
                    break;
                default:
                    System.out.println("opcion no valida");
            }
        }
        while(opcion !=4);
        
    }
    
}
