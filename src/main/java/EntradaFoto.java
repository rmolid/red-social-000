

/**
 * Una entrada con imagenes
 *
 * Una entrada es un contenido que el usuario comparte en su muro con la comunidad.
 * Las entradas con imagenes se crean a partir de un autor, un titulo
 * para la imagen y la url de la imagen.
 *
 *  @author DAM
 *  @version 1.0
 */
public class EntradaFoto extends EntradaConComentario
{
    // URL de la imagen.
    private String urlImagen;
    //Título de la entrada.
    private String titulo;


    /**
     * Constructor - Construye entradas a partir de un autor, el titulo de la imagen y su URL.
     * Las entradas se crean sin ningun ' me gusta'.
     * La fecha de publicacion coincide con el momento en el que se crea la entrada.
     * @param autor Autor de la entrada.
     * @param titulo Titulo de la imagen.
     * @param url URL de la imagen.
     */
    public EntradaFoto (String autor, String url, String titulo) {
        super(autor);
        this.urlImagen = url;
        this.titulo = titulo;
    }

    /**
     * Devuelve el URL de la imagen.
     * @return Devuelve el URL de la imagen.
     */
    public String getUrlImagen() {
        return urlImagen;
    }

    /**
     * Devuelve el titulo de la imagen.
     * @return Devuelve el titulo de la imagen.
     */
    public String getTituloImagen() {

        return titulo;
    }

    /**
     * Devuelve una cadena con toda la informacion de la entrada.
     * @return Devuelve una cadena con toda la informacion de la entrada.
     */
    @Override
    public String toString() {
        
        String aDevolver = super.toString();
        aDevolver += "Url: " + urlImagen + "\n";
        aDevolver += "Titulo: " + titulo + "\n";
        return aDevolver.substring(0,aDevolver.length());
    }




}