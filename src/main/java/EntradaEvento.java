public class EntradaEvento extends Entrada {

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
     * Devuelve una cadena con la informacion relativa a entrada evento.
     * @return Devuelve una cadena con la informacion relativa a entrada evento.
     */
    @Override
    public String toString() {
        String aDevolver = super.toString();    
        aDevolver += getEvento() + "\n";      
        return aDevolver.substring(0,aDevolver.length()-1);
    }

    /**
     * Metodo que muestra por pantalla los detalles de las entradas de evento
     */
    public void mostrarDetallesPorPantalla(){
        System.out.println("Nuevo evento de: " + getUsuario());
        System.out.println("Evento: " + this.evento);
    }
}