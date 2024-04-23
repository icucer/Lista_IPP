package cl.ipp.lista_ipp;

// Crearemos una clase publica "listaConMetodos" donde pricipalmente ubicaremos donde esta
// situado el nodo cabeza y con su constructor ya explicado en la clase Nodo. Y aparte de esto
// contiene todos los metodos que se ocuparan para manipular la lista y sus objetos (nodos).
public class listaConMetodos {
    Nodo cabeza;

    public listaConMetodos() {
        this.cabeza = null;
    }

    // Método para insertar un nodo al final de la lista
    public void insertar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    // Método para insertar un nodo en una posición específica de la lista
    public void insertarEnPosicion(int dato, int posicion) {
        Nodo nuevoNodo = new Nodo(dato);
        if (posicion <= 0) {
            nuevoNodo.siguiente = cabeza;
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            for (int i = 0; i < posicion - 1 && actual != null; i++) {
                actual = actual.siguiente;
            }
            if (actual != null) {
                nuevoNodo.siguiente = actual.siguiente;
                actual.siguiente = nuevoNodo;
            }
        }
    }

    // Método para eliminar un nodo en una posición específica de la lista
    public void eliminarEnPosicion(int posicion) {
        if (cabeza == null) {
            return;
        }
        if (posicion == 0) {
            cabeza = cabeza.siguiente;
            return;
        }

        Nodo actual = cabeza;
        for (int i = 0; actual != null && i < posicion - 1; i++) {
            actual = actual.siguiente;
        }

        if (actual == null || actual.siguiente == null) {
            return;
        }

        actual.siguiente = actual.siguiente.siguiente;
    }

    // Método para recorrer e imprimir la lista
    public void recorrer() {
        Nodo actual = cabeza;
        System.out.println("Lista enlazada:");
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    // Método para recorrer e imprimir la lista en orden invertido
    public void recorrerInvertido() {
        recorrerInvertidoRecursivo(cabeza);
        System.out.println();
    }

    private void recorrerInvertidoRecursivo(Nodo nodo) {
        if (nodo == null) {
            return;
        }
        recorrerInvertidoRecursivo(nodo.siguiente);
        System.out.print(nodo.dato + " ");
    }

    // Método para obtener el tamaño de la lista
    public int obtenerTamaño() {
        int tamaño = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            tamaño++;
            actual = actual.siguiente;
        }
        return tamaño;
    }
}