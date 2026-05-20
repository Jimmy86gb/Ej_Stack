package co.edu.udistrital.model;

/**
 * clase modelo encargada de la logica de balanceo usando pila propia.
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
     * verifica si los simbolos estan balanceados con nuestra pila de nodos.
     * 
     * @return true si esta balanceado, false si hay algun error
     */
    public boolean verifyBalance() {
        // usamos nuestra pila personalizada
        Stack stack = new Stack();

        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) { 
                    return false; 
                }
                
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
     * 
     * @param txt cadena de texto a guardar
     */
    public void setTxt(String txt) {
        this.txt = txt;
    }
}