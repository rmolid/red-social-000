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
            entrada.mostrarDetallesPorPantalla();
        }
    }

    /**
     * Devuelve un array con las url de las EntradaFoto
     */
    public String[] getUrlsFotos() {
        int i = entradas.size();
        String[] urls = new String[i];
        int contador = 0;
        for (Entrada entrada : entradas){
            //comprobar si es una entrada de tipo foto
            if(entrada instanceof EntradaFoto){
                contador++;
                EntradaFoto foto = (EntradaFoto)entrada;
                urls[contador] = foto.getUrlImagen() + "\n";
                System.out.println(urls[contador]);
           }
        }
        return urls;
        
    }

}


