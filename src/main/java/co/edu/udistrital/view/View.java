package co.edu.udistrital.view;

import java.util.Scanner;

/**
 * clase vista que maneja la entrada y salida de datos por consola.
 *
 * @author Jimmy86gb
 */
public class View {
    private Scanner sc;
    
    /**
     * constructor que inicializa el scanner.
     */
    public View() {
        sc = new Scanner(System.in);
    }
    
    /**
     * muestra un mensaje al usuario y lee la entrada por consola.
     * * @param msg mensaje a mostrar
     * @return el texto ingresado
     */
    public String readData(String msg) {
        showMsg(msg);
        String text = sc.nextLine();
        return text;
    }
    
    /**
     * imprime un mensaje por pantalla.
     * * @param msg mensaje a imprimir
     */
    public void showMsg(String msg) {
        System.out.println(msg);
    }
}