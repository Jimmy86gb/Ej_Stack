package co.edu.udistrital.model;

/**
 * clase pila implementada con nodos (estructura de datos dinamica).
 *
 * @author Jimmy86gb
 */
public class Stack {
    private Node top;

    /**
     * inicializa la pila vacia.
     */
    public Stack() {
        this.top = null;
    }

    /**
     * apila un nuevo caracter.
     * 
     * @param data caracter a insertar
     */
    public void push(char data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    /**
     * desapila el caracter en la cima.
     * 
     * @return el caracter extraido o un caracter nulo si esta vacia
     */
    public char pop() {
        if (isEmpty()) { return '\0'; }
        
        char data = top.data;
        top = top.next;
        return data;
    }

    /**
     * verifica si la pila esta vacia.
     * 
     * @return true si esta vacia, false en caso contrario
     */
    public boolean isEmpty() {
        return top == null;
    }
}