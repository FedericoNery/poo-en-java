package fnery;

public class I_ModificadoresDeAcceso {
    /*
        public -> clase, paquete, subclase, resto del programa
        protected -> clase, paquete, subclase
        sin modificador -> clase, paquete
        private -> clase
    */

    /*
    Static hace al atributo dependiente de la clase
    Final cuando es definido, no es posible realizar ningún cambio
    Abstract hace las clases y métodos abstractos
    Synchronized usado para sincronizar hilos
     */

    private final long dni = 12345678;
    /*
    su contenido no puede variar. Si es un objeto, no puede cambiar la referencia
    , es decir, no se puede asignar un nuevo objeto pero SI SE PUEDE cambiar los valores de sus atributos.
    */
    private final int calcularPromedio(){
        return 0;
    }
    /* no puede ser sobreescrito por las subclases
    * */

    public static final class Asignatura
    {

    } // no puede ser heredada pero si instanciada
}
