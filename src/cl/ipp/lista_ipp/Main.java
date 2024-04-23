package cl.ipp.lista_ipp;

// Clase principal de un programa Java "Main". Actúa como el punto de entrada para el programa, esto significa
// que es el lugar donde comienza la ejecución del programa.
public class Main {

    // La clase Main en Java tambien tiene un metodo main que es un formato prediterminado.
    // Este método es donde se coloca el código que se ejecutará cuando inicies el programa.
    public static void main(String[] args) {
        listaConMetodos lista = new listaConMetodos();

        // Instrucciones entregados al programa Java. Son llamadas a los clases y metodos para
        // ejecutar alguna determinada instrucion:

        // Insertar nodos a la lista, este metodo se dedicara la creacion de un nodo que significara un objeto nuevo
        // en caso de nosotros tendremos el proceso de creacion de 5 objetos.
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);
        lista.insertar(5);

        // Recorrer e imprimir la lista en orden invertido, la instruccion dada hace llamado a un metodo
        // que se encarga de recorer la lista invertida y imprimir cada uno de los objetos recoridos,
        // esto significara que es un metodo que ejecuta una accion y no crea algo en especifico como el
        // metodo anterior que inserta datos y por ende provoca la creacion de un objeto.
        lista.recorrerInvertido();

        // Indicar el tamaño de la lista, como el metodo anterior haremos llamado a un metodo estandart de Java
        // para poder imprimir por la consola y en parentezis entregamos dos argumentos concatenados un string
        // que contiene un texto y lo concatenamos con el valor entregado por un metodo que nos indicara el tamano
        // del areglo lista.
        System.out.println("Tamaño de la lista: " + lista.obtenerTamaño());

        // Insertar un nodo en la primera posición, el siguente metodo nos proporcionara la creacion de un objeto
        // al metodo le proporcionamos el dato y la pozicion se creara el dicho objeto.
        lista.insertarEnPosicion(6, 0);

        // Eliminar un nodo en una posicion especifica. En caso de nosotros se eliminara el tercer objeto de la lista.
        lista.eliminarEnPosicion(3);

        // Recorrer e imprimir la lista. Y por ultimo recoremos la lista objeto por objeto y monstraremos por consola
        // el dato de cada objeto.
        lista.recorrer();
    }
}