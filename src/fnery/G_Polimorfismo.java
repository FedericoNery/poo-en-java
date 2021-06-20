package fnery;

/*
    ¿Qué es el polimorfismo? Consiste en que nosotros podemos ejecutar un método con el mismo nombre pero con argumentos
    que poseen un tipo de dato diferente, por lo cual, cada método puede implementarse para responder de manera distinta
*/
public class G_Polimorfismo {

    /*Este polimorfismo se realiza en tiempo de compilacion*/
    public static class Calculadora {
        static int sumar(int a, int b){
            return a+b;
        }
        static double sumar(double a, double b){
            return a+b;
        }
    }

    /*
    Este polimorfismo se realiza en tiempo de ejecución - Hay que fijarse que sms no recibe ningún argumento o parámetro, entonces
    cuando se llame al método sms, Java va a tener que detectar qué metodo ejecutar, si se sobreescribió va a ejecutar el método de OnePlus,
    sino va a ejecutar el de Celular, esto sucede de forma similar a Python con el MRO
    */
    public static class Celular{
        void sms(){System.out.println("Clase celular");}
    }
    public static class OnePlus extends Celular{
        void sms(){
            System.out.println("Clase OnePlus");
        }
    }

    public static void main(String args[]){
        System.out.println(Calculadora.sumar(123,17));
        System.out.println(Calculadora.sumar(18.3,1.9));

        OnePlus smsObj= new OnePlus();
        smsObj.sms();

    }
}
