import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase de test para el muro de la red social
 *
 *  @author DAM
 *  @version 1.0
 */
public class MuroTest {
    @Test
    public void test01() {

        Muro muro = new Muro();

        EntradaTexto entrada01 = new EntradaTexto("Nacho", "Recién llegado de mis vacaciones en Hawai!");
        EntradaFoto entrada02 = new EntradaFoto("Luis", "https://bit.ly/2W1dO09", "Gracias");
        EntradaTexto entrada03 = new EntradaTexto("Begoña", "Está lloviendo ahí fuera...");
        EntradaFoto entrada04 = new EntradaFoto("Cristina", "https://bit.ly/3cY9vtD", "Una foto de mi nevera");

        muro.addEntradaTexto(entrada01);
        muro.addEntradaFoto(entrada02);
        muro.addEntradaTexto(entrada03);
        muro.addEntradaFoto(entrada04);

        System.out.println(muro);
    }

}
