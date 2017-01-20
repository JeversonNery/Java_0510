
package java_0510;

import java.util.Random;
/**
 *
 * @author Jeverson Nery
 */
public class Java_0510 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random gerador = new Random();
        int numero = gerador.nextInt(60);
        
        System.out.println(numero);
                
    }
    
}
