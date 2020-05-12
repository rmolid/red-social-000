import java.util.ArrayList;

public class EntradaConComentario extends Entrada {

    // Comentarios de la entrada.
    private ArrayList<String> comentarios;

    //constructor de la clase EntradaConComentario
    public EntradaConComentario(String usuario) {
        super(usuario);
        this.comentarios = new ArrayList<>();
    }

    //METODOS DE LA CLASE.

    /**
     * Devuelve la lista de comentarios de una publicacion.
     * @return comentarios de una publicacion.
     */
    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    /**
     * Anade un comentario a a la entrada.
     * @param textoComentario El comentario a anadir.
     */
    public void addComentario(String textoComentario) {
        comentarios.add(textoComentario);
    }

    /**
     * Comprobamos si hay comentarios. Si hay los mostramos, si no, mostramos
     * un mensaje indicandolo.
     */
    public String getComentariosTexto(){
        String textoComentario = "";
        if (comentarios.isEmpty())         {
            textoComentario += "No hay comentarios\n";
        }
        else {
            textoComentario += "";
            for(String comentarioActual : comentarios){
                textoComentario += comentarioActual + "\n";
            }
        }
        return textoComentario;
    }

    /**
     * Metodo toString que devuelve la informacion que pertenece a las entradas 
     * con comentarios
     * @return String con la informacion que pertenece a Entrada con comentario
     */
    @Override
    public String toString(){
        String aDevolver =super.toString();
        aDevolver += "Comentarios: " + getComentariosTexto() + "\n";
        return aDevolver;
    }


    

}