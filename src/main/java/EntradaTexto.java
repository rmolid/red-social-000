

/**
 * Una entrada con texto
 *
 * Una entrada es un contenido que el usuario comparte en su muro con la comunidad.
 * Las entradas con imagenes se crean a partir de un autor y un contenido.
 *
 *  @author DAM
 *  @version 1.0
 */

public class EntradaTexto extends EntradaConComentario
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
     * Devuelve una cadena con toda la informacion de la entrada de texto
     * @return Devuelve una cadena con toda la informacion de la entrada de texto.
     */
    @Override
    public String toString() {

        String aDevolver = super.toString();
        aDevolver += mensaje + "\n";
        return aDevolver.substring(0,aDevolver.length());
    }

    /**
     * Metodo que muestra por pantalla el autor y el texto del mensaje
     */
    public String mostrarAutorYMensaje(){
        String aDevolver = "Autor: " + super.getUsuario() + "\n" + "Mensaje: " + this.getMensaje() + "\n";
        System.out.print(aDevolver);
        return aDevolver;

    }   
    /**
     * Metodo que muestra por pantalla los detalles de las entradas de texto
     */
    public void mostrarDetallesPorPantalla(){
        System.out.println("Nuevo texto de: " + getUsuario());
        System.out.println("Mensaje: " + this.mensaje);
    }

}