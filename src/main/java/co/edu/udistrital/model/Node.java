package co.edu.udistrital.model;

/**
 * clase nodo para almacenar los caracteres en la pila dinamica.
 *
 * @author Jimmy86gb
 */
public class Node {
    char data;
    Node next;

    /**
     * constructor del nodo.
     * 
     * @param data caracter a almacenar
     */
    public Node(char data) {
        this.data = data;
        this.next = null;
    }
}