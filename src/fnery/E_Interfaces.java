package fnery;

public class E_Interfaces {
    /*
        En Java, a diferencia de Python, si podemos poseer e implementar una interface.
        Las interfaces están compuestas por definiciones de métodos, sus firmas.
        Esto quiere decir que la clase que implemente esa interface deberá implementar todas las firmas de dicha interface
        en su clase.
        A diferencia de Python, Java no posee herencia múltiple, lo más similar que se puede relacionar a "herencia múltiple"
        es la posibilidad de que una clase herede de muchas interfaces
        solo permite el accesor public
    */
    public interface Bicicleta {
        public void arrancar();
        public void cambiarCadena();
    }

    public static class Honda implements Bicicleta {
        public void arrancar() {
            System.out.println("Bicicleta Honda");
        }
        public void cambiarCadena() {
            System.out.println("Cambiando cadena Bicicleta Honda");
        }
    }

    public static class Apache implements Bicicleta {
        public void arrancar() {
            System.out.println("Bicicleta Apache");
        }
        public void cambiarCadena() {
            System.out.println("Cambiando cadena Bicicleta Apache");
        }
    }

    public static void main(String args[]){
        Bicicleta b1=new Honda();
        b1.arrancar();
        Bicicleta b2=new Apache();
        b2.arrancar();
    }

}
