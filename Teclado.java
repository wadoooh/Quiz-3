/**
 * Clase Teclado
 */
public class Teclado {
    /***************************************************/
    /******************** Atributos ********************/
    /***************************************************/
    String marca;
    int teclas;
    double tipo;

    /***************************************************/
    /******************** Métodos ********************/
    /***************************************************/

    /**
     * Constructor de la clase Teclado: Inicializa los atributos de mi clase
     * @param marca
     * @param teclas
     * @param tipo
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public Teclado(String marca, int teclas, double tipo){
        this.marca = marca;
        this.teclas = teclas;
        this.tipo = tipo;
    }

    /**
     * Método de conectar el teclado
     * @return boolean: Indica si mi teclado se puede conectar
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    boolean conectar(){
        System.out.println("El teclado se ha conectado correctamente");
        return true;
    }

    /**
     * Método que desconecta mi teclado
     * @return boolean: Indica si mi teclado no esta puede conectar
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    boolean desconectar(){
        System.out.println("Se ha desconectado el teclado");
        return true;
    }

    /**
     * Método que hace escribir a el teclado
     * @return boolean: Indica si se puede escribir con el teclado
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    boolean escribir(){
        System.out.println("Click* Click* Click* Click* escribe");
        return true;
    }
}
