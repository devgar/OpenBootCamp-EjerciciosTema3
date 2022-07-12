public class Main {


    /**
     * Función que concatena las palabras de un array de Strings
     * @param palabras Array de Strings con las palabras a ser concatenadas.
     */
    public static String concatenar(String [] palabras){
        StringBuilder resultado = new StringBuilder();
        for (String palabra : palabras) {
            resultado.append(palabra);
        }
        return resultado.toString();
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