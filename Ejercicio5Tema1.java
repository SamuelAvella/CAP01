public class Ejercicio5Tema1{
    public static void main(String[] args) {
        System.out.printf("%-16s %-10s %-10s %-10s %-10s\n", CYAN_BRIGHT+"LUNES","MARTES","MIERC.","JUEVES","VIERNES"+RESET);
        System.out.printf(PURPLE_BRIGHT+"--------------------------------------------------\n");
        System.out.printf("%-16s %-17s %-17s %-21s %-10s\n", RED_BRIGHT+"PROG.",GREEN_BRIGHT+"LENG.",GREEN_BRIGHT+"LENG.",RED_BRIGHT+"PROG."+RESET,"FOL");
        System.out.printf("%-16s %-17s %-17s %-21s %-10s\n", RED_BRIGHT+"PROG.",GREEN_BRIGHT+"LENG.",GREEN_BRIGHT+"LENG.",RED_BRIGHT+"PROG."+RESET,"FOL");
        System.out.printf("%-16s %-17s %-17s %-21s %-10s\n", RED_BRIGHT+"PROG.",YELLOW_BRIGHT+"BDD",RED_BRIGHT+"PROG.",RED_BRIGHT+"PROG."+RESET,"FOL");
        System.out.printf("%-16s %-17s %-17s %-17s %-10s\n", BLUE_BRIGHT+"SIST.",YELLOW_BRIGHT+"BDD",RED_BRIGHT+"PROG.",YELLOW_BRIGHT+"BDD",BLUE_BRIGHT+"SIST");
        System.out.printf("%-16s %-17s %-17s %-17s %-10s\n", BLUE_BRIGHT+"SIST.",PURPLE_BRIGHT+"ENTOR.",YELLOW_BRIGHT+"BDD",YELLOW_BRIGHT+"BDD",BLUE_BRIGHT+"SIST");
        System.out.printf("%-16s %-17s %-17s %-17s %-10s\n", BLUE_BRIGHT+"SIST.",PURPLE_BRIGHT+"ENTOR.",YELLOW_BRIGHT+"BDD",PURPLE_BRIGHT+"ENTOR.",BLUE_BRIGHT+"SIST");
    }
    public static final String RESET = "\033[0m";
    public static final String BLUE_BRIGHT = "\033[0;94m";
    public static final String RED_BRIGHT = "\033[0;91m";
    public static final String YELLOW_BRIGHT = "\033[0;93m";
    public static final String GREEN_BRIGHT = "\033[0;92m";
    public static final String PURPLE_BRIGHT = "\033[0;95m";
    public static final String CYAN_BRIGHT = "\033[0;96m";
}
