package navidad04;
import java.util.Scanner;
/**
 * Clase main
 *
 * Contiene un bucle switch para calcular notas
 *
 * @author Morgana
 * @version 1.0
 */
public class Navidad04 {

    static Scanner entrada = new Scanner(System.in);
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
                
        //Atributos
        /**
         * @param args nota posible de cada alumno
        */
        int nota;
        
        /**
         * Entrada por teclado, para introducir la nota
        */
        System.out.print("Introduce tu nota: ");
        nota = entrada.nextInt();          
        
        //Metodos publicos
 
        /**
         * Al meter la nota, en el bucle switch pasa por todos los casos hasta
         * coincidir y saca por pantalla el resultado de la nota.
         * 
         * También tiene como por defecto un mensaje de error ya que solo vamos
         * a calcular notas del 0 al 10.
        */
        switch(nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Insuficiente");
            break;
            case 5:
                System.out.println("Suficiente");
            break;
            case 6:
                System.out.println("Bien");
            break;
            case 7:
            case 8:
                System.out.println("Notable");
            break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
            break;
            default:
                System.out.println("ERROR INTRODUCE UNA NOTA ENTRE 0 Y 10.");
            break;
        }
    } 
}
