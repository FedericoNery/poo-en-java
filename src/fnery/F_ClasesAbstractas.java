package fnery;

public class F_ClasesAbstractas {
    /*
        Como recordamos de Python, las clases abstractas pueden poseer atributos, métodos implementados o sin implementar.
        No pueden ser instanciadas
    */
    public abstract class MyAbstractClass
    {
        public abstract void abstractMethod();
        public void display(){
            System.out.println("Concrete method");
        }
    }

    public static void main(String[] args) {

    }
}
