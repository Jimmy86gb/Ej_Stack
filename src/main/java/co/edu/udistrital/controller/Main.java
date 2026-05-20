package co.edu.udistrital.controller;

/**
 * clase principal que arranca la aplicacion.
 *
 * @author Jimmy86gb
 */
public class Main {

    /**
     * metodo ejecutable del programa.
     *
     * @param args argumentos de linea de comandos
     */
    public static void main(String[] args) {
        Controller control;
        control = new Controller();
        control.run();
    }
}
