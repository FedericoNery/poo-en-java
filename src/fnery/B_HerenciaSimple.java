package fnery;

public class B_HerenciaSimple {

    public static class Persona {
        public String nombre;
        public String apellido;
        public String dni;

        public Persona(String nombre, String apellido, String dni){
            this.nombre = nombre;
            this.apellido = apellido;
            this.dni = dni;
        }
    }

    public static class Estudiante extends Persona {
        public String legajo;

        public Estudiante(String legajo){
            super("Nombre", "Apellido", "Dni");
            this.legajo = legajo;
        }
    }

    public static void main(String[] args) {

    }
}
