import java.util.ArrayList;

/**
 * El muro de nuestra red social.
 *
 * El muro es el lugar donde los usuarios publicaran sus entradas.
 *
 * @author DAM
 * @version 1.0
 */
public class Muro
{
    // Entradas del muro
    private ArrayList <Entrada> entradas;

    /**
     * Constructor - Construye e inicializa un muro vacio.
     */
    public Muro() {
        //Inicializa las entradas.      
        entradas = new ArrayList<>();
    }

    /**
     * Anade una entrada  al muro
     * @param entrada La entrada a anadir.
     */
    public void addEntrada(Entrada entrada){
        entradas.add(entrada);
    }

    /**
     * Devuelve una cadena con toda la informacion del muro.
     * @return Devuelve una cadena con toda la informacion del muro.
     */
    @Override
    public String toString() {
        String aDevolver = "";

        // Buscamos todas las entradas
        for (Entrada entrada : entradas) {
            aDevolver += entrada + "\n\n";
        }

        return aDevolver.substring(0, aDevolver.length());
    }
    /**
     * Metodo que muestra por pantalla los detalles de todas las entradas añadidas
     *  al muro en el orden en el que fueron añadidas.
     */
    public void mostrarDetallesTodasLasEntradas(){
        for(Entrada entrada : entradas){
            if (entrada instanceof EntradaFoto){
                EntradaFoto ef = (EntradaFoto) entrada;
                ef.mostrarDetallesPorPantalla();
            }
            else if (entrada instanceof EntradaTexto){
                EntradaTexto et = (EntradaTexto) entrada;
                et.mostrarDetallesPorPantalla();
            }else{
                EntradaEvento ev = (EntradaEvento) entrada;
                ev.mostrarDetallesPorPantalla();
            }
            }
        }

    }


