

/**
 * Una entrada con texto
 *
 * Una entrada es un contenido que el usuario comparte en su muro con la comunidad.
 * Las entradas con imagenes se crean a partir de un autor y un contenido.
 *
 *  @author DAM
 *  @version 1.0
 */

public class EntradaTexto extends Entrada
{

    // Contenido de la entrada.
    private String mensaje;


    /**
     * Constructor - Construye entradas a partir de un autor y un contenido.
     * Las entradas se crean sin ningun ' me gusta'.
     * La fecha de publicacion coincide con el momento en el que se crea la entrada.
     * @param mensaje Contenido de la entrada.
     */
    public EntradaTexto ( String usuario, String texto) {
        super(usuario);
        this.mensaje = texto;
    }


    /**
     * Devuelve el contenido de la entrada.
     * @return Devuelve el contenido de la entrada.
     */
    public String getMensaje() {
        return mensaje;
    }


    /**
     * Devuelve una cadena con toda la informacion de la entrada.
     * @return Devuelve una cadena con toda la informacion de la entrada.
     */
    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver += "Usuario: " + getUsuario() + "\n";
        aDevolver += "Likes: " + getCantidadMeGusta() + "\n";
        aDevolver += mensaje + "\n";

        // Calculamos el numero de segundos que han pasado desde la fecha de publicacion.
       
        aDevolver +=getTiempoDesdeLaPublicacion() + "\n";

        // Comprobamos si hay comentarios. Si hay los mostramos, si no, mostramos un mensaje indicandolo.
        if (getComentarios().isEmpty())         {
            aDevolver += "No hay comentarios\n";
        }
        else {
            aDevolver += "Comentarios: \n";
            for(String comentarioActual : getComentarios()){
                aDevolver += comentarioActual + "\n";
            }
        }

        return aDevolver;
    }
}