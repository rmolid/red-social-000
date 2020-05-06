import java.time.LocalDateTime;
import java.util.ArrayList;

public class Entrada {

    // Usuario que crea la entrada.
    private String usuario;
    // Fecha de publicacion de la entrada.
    private LocalDateTime momentoPublicacion;
    // Numero de 'me gusta' de la entrada.
    private int cantidadMeGusta;
    // Comentarios de la entrada.
    private ArrayList<String> comentarios;

    /**
     * Constructor de la clase entrada.
     * @param autor
     */
    public Entrada (String autor){
        this.usuario = autor;
        this.comentarios = new ArrayList<>();
    }
    /**
     * Anade un 'me gusta' a la entrada.
     */
    public void meGusta() {
        cantidadMeGusta += 1;
    }

    /**
     * Anade un comentario a a la entrada.
     * @param textoComentario El comentario a anadir.
     */
    public void addComentario(String textoComentario) {
        comentarios.add(textoComentario);
    }

    /**
     * Devuelve la fecha de publicacion.
     * @return Devuelve la fecha de publicacion.
     */
    public LocalDateTime getMomentoPublicacion() {
        return momentoPublicacion;
    }

    /**
     * Devuelve el usuario de la publicacion.
     * @return usuario de la publicacion.
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Devuelve la cantidad de me gustas de una publicacion.
     * @return cantidad de me gustas en una publicacion
     */
    public int getCantidadMeGusta() {
        return cantidadMeGusta;
    }

    /**
     * Devuelve la lista de comentarios de una publicacion.
     * @return comentarios de una publicacion.
     */
    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public String getTiempoDesdeLaPublicacion(){
        return "Escrito hace 10 segundos";
    }

    public String toString(){
        return "";
    }
    
}
