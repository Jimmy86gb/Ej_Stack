package co.edu.udistrital.controller;

import co.edu.udistrital.view.View;
import co.edu.udistrital.model.BalanceSymb;

/**
 * clase controlador que maneja la logica entre la vista y el modelo.
 *
 * @author Jimmy86gb
 */
public class Controller {
    private final View view;
    
    /**
     * constructor del controlador, inicializa la vista.
     */
    public Controller() {
        view = new View();
    }
    
    /**
     * metodo principal que ejecuta el menu del programa.
     */
    public void run() {
        String option = "";
        do {
            view.showMsg("""              
                         Menu Ejercicio Pilas
                         1. Digitar texto con simbolos
                         2. Salir
                         """);
            option = view.readData("Selecciona una opcion");
            switch(option) {
                case "1":
                    String txt = view.readData("\nDigite el texto con simbolos"
                            + " a analizar:");
                    balanceSymb(txt);
                    break;
                case "2":
                    view.showMsg("Saliendo del Programa");
                    break;
                default: 
                    view.showMsg("\nOpcion no valida");
            }
        } while(!option.equals("2"));
    }
    
    /**
     * metodo que recibe el texto, llama al modelo y muestra el resultado.
     * 
     * @param txt texto a evaluar
     */
    public void balanceSymb(String txt) {
        BalanceSymb balance = new BalanceSymb();
        balance.setTxt(txt);
        boolean balanced = balance.verifyBalance();
        
        if(balanced) {
            view.showMsg("El texto '" + txt + "' es correcto");
        } else {
            view.showMsg("El texto '" + txt + "' NO es correcto");
        }
    }
}