package cl.ipp.lista_ipp;

// La clase "Nodo" contempla el modelo del objeto: en caso de nosotros es una variable llamada dato
// que guardara un valor entero y la siguente linia indica que cada instancia de la clase nodo
// apuntara al siguente objeto en la lista.
public class Nodo {
    int dato;
    Nodo siguiente;

    // las siguentes lineas a continuacion coresponden al constructor de la clase Nodo,
    // que se encarga de atribuir el valor entregado como parametro al constructor a la variable
    // dato del objeto en construccion. Lo mismo pasa con la relacion del siguiente que es nulo.
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}