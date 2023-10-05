public class Ejercicio10Tema2 {
    public static void main(String[] args) {
        System.out.printf(RED+"%25s\n","\u2588\u2588");
        System.out.printf("%14s %8s\n","APRENDE JAVA","\u2588\u2588");
        System.out.printf("%15s %9s\n","CON EJERCICIOS","\u2588\u2588");
        System.out.println(""+RESET);
        System.out.printf("%15s %21s\n",YELLOW+"Luis José Sánchez",BLUE+"\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588");
        System.out.printf("%28s %3s\n","\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588","\u2588\u2588");
        System.out.printf("%32s\n","\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588");
        System.out.printf("%28s\n","\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588");
        System.out.printf("%28s\n","\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588");
    }
    public static final String RED = "\033[0;31m";
    public static final String RESET = "\033[0m";
    public static final String YELLOW = "\033[0;33m";
    public static final String BLUE = "\033[0;34m";
    
}
