package fnery;

public class A_Clases_Y_Objetos {
    /*
        A efectos prácticos, le ponemos la palabra reservada static así tenemos todas las clases en este archivo
        Cuando estemos desarrollando un programa o sistema orientado a objetos todas las clases van tener que estar en archivos separados
    */
    public static class Auto {
        /*
            Si nosotros a la clase no le definimos un constructor, automaticamente Java por defecto le agrega uno vacío en tiempo de ejecución
            public Test(){
            }
        */
        public String marca;
        public int hp;

        /*
            Java posee la particularidad de que se puede definir varios constructores en simultáneo, dependiendo de que parámetros se les pase o no
            Java llamará al constructor determinado que cumpla con los argumentos que se les pasó
        */

        public Auto() {

        }

        public Auto(int hp, String marca){
            this.marca = marca;
            this.hp = hp;
        }
    }

    public static void main(String[] args) {
        Auto auto = new Auto();
    }
}
