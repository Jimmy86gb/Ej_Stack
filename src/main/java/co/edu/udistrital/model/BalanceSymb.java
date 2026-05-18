package co.edu.udistrital.model;

import java.util.Stack;

/**
 * clase modelo encargada de la logica de balanceo de simbolos.
 *
 * @author Jimmy86gb
 */
public class BalanceSymb {
    private String txt;
    
    /**
     * constructor vacio por defecto.
     */
    public BalanceSymb() {
        
    }
    
    /**
     * verifica si los simbolos en el texto estan balanceados usando una pila.
     * * @return true si esta balanceado, false si hay algun error en los simbolos
     */
    public boolean verifyBalance() {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) { return false; }
                
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
    /**
     * asigna el texto a analizar.
     * * @param txt cadena de texto a guardar en la clase
     */
    public void setTxt(String txt) {
        this.txt = txt;
    }
}