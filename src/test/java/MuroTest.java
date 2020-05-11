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

        EntradaTexto entrada01 = new EntradaTexto("Nacho", "Recien llegado de mis vacaciones en Hawai!");
        EntradaFoto entrada02 = new EntradaFoto("Luis", "https://bit.ly/2W1dO09", "Gracias");
        EntradaTexto entrada03 = new EntradaTexto("Begona", "Esta lloviendo ahi fuera...");
        EntradaFoto entrada04 = new EntradaFoto("Cristina", "https://bit.ly/3cY9vtD", "Una foto de mi nevera");


        //no agregada al muro
        EntradaTexto entrada05 = new EntradaTexto("Luis", "Hola Mundo!");

        // Entradas con evento para testear

        EntradaEvento entrada06 = new EntradaEvento("Luis", "Se ha unido al grupo DAM");
        EntradaEvento entrada07 = new EntradaEvento("Maria", "Ha abandonado el grupo DAM");

        //Añadir entradas al muro
        muro.addEntrada(entrada01);
        muro.addEntrada(entrada02);
        muro.addEntrada(entrada03);
        muro.addEntrada(entrada04);
        muro.addEntrada(entrada06);
        muro.addEntrada(entrada07);
        
        //Testear muro
        System.out.println(muro);
        assertEquals("Usuario: Nacho\nLikes: 0\nRecien llegado de mis vacaciones en Hawai!\nhace 10 segundos\nNo hay comentarios\n\n\n" +
        "Usuario: Luis\nLikes: 0\nUrl: https://bit.ly/2W1dO09\nTitulo: Gracias\nhace 10 segundos\nNo hay comentarios\n\n\n" + 
        "Usuario: Begona\nLikes: 0\nEsta lloviendo ahi fuera...\nhace 10 segundos\nNo hay comentarios\n\n\n"  +
        "Usuario: Cristina\nLikes: 0\nUrl: https://bit.ly/3cY9vtD\nTitulo: Una foto de mi nevera\nhace 10 segundos\nNo hay comentarios\n\n\n" +
        "Usuario: Luis\nLikes: 0\nSe ha unido al grupo DAM\nMomento de publicacion:hace 10 segundos\n\n\n" +
        "Usuario: Maria\nLikes: 0\nHa abandonado el grupo DAM\nMomento de publicacion:hace 10 segundos\n\n\n",
        muro.toString());



        //Teatear entradas de texto
        assertEquals("Autor: Nacho\nMensaje: Recien llegado de mis vacaciones en Hawai!\n", entrada01.mostrarAutorYMensaje());
        assertEquals("Autor: Begona\nMensaje: Esta lloviendo ahi fuera...\n", entrada03.mostrarAutorYMensaje());
        assertEquals("Autor: Luis\nMensaje: Hola Mundo!\n", entrada05.mostrarAutorYMensaje());

       
    }

}