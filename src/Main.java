public class Main {


    /**
     * Función que concatena las palabras de un array de Strings
     * @param palabras Array de Strings con las palabras a ser concatenadas.
     */
    public static String concatenar(String [] palabras){
        String resultado = "";
        for (String palabra : palabras) {
            resultado += palabra;
        }
        return resultado;
    }
    /**
     * Función principal.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] palabras = new String[]{"Hola", "Mundo", "!"};
        System.out.println(concatenar(palabras));
    }
}