

public class EntradaEvento extends Entrada{

    //Evento de la EntradaEvento
    private String evento;

    //Constructor de la clase
    public EntradaEvento(String usuario, String evento){
        super(usuario);
        this.evento = evento;
    }

    // Metodos de la clase EntradaEvento
    
    /**
     * Metodo que devuelve el evento de la entrada
     */
    public String getEvento(){
        return this.evento;
    }

    /**
     * Devuelve una cadena con el usuario, evento y tiempo de publicacion de la entrada.
     * @return Devuelve una cadena con el usuario, evento y tiempo de publicacion.
     */
    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver +=   getUsuario() + " " + getEvento() + " " + "(" + getTiempoDesdeLaPublicacion() + ")";
        return aDevolver;
    }
}