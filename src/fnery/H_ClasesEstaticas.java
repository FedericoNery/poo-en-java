package fnery;

public class H_ClasesEstaticas {
    /*
        No se requiere una instancia del objeto para utilizarlos
        Un método static no puede usar atributos NO STATIC
    */

    public static class Estudiante {
        static String escuela;

        static void darNombreAEscuela(String n){
            Estudiante.escuela = n;
        }


    }
}
