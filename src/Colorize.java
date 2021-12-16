public class Colorize {
    public enum COLORS  {
        RED,GREEN, YELLOW,BLUE, PURPLE, CYAN, GRAY, BRIGHT_RED, BRIGHT_GREEN, BRIGHT_YELLOW,
        BRIGHT_BLUE, BRIGHT_MAGENTA, BRIGHT_CYAN, RESET
    }

    public enum BACKGROUNDS {
        BLACK, RED, GREEN, YELLOW, BLUE, PURPLE, CYAN, WHITE
    }


    public static String colorize(String string, COLORS color) {
        String ansiString = getAnsiColorString(color);
        String ansiReset = getAnsiColorString(COLORS.RESET);
        return ansiString + string + ansiReset;
    }

    public static String colorize(String string, COLORS color, BACKGROUNDS background) {
        String ansiBackground = getAnsiBackgroundString(background); 
        String ansiString = getAnsiColorString(color);
        String ansiReset = getAnsiColorString(COLORS.RESET);
        return ansiBackground + ansiString + string + ansiReset;
    }

    public static String colorize(String string, BACKGROUNDS background){
        String ansiBackground = getAnsiBackgroundString(background); 
        String ansiReset = getAnsiColorString(COLORS.RESET);
        return ansiBackground + string + ansiReset;
    }

    private static String getAnsiColorString(COLORS color) {
        return switch (color) {
            case RED -> "\u001B[31m";
            case GREEN -> "\u001B[32m";
            case YELLOW -> "\u001B[33m";
            case BLUE -> "\u001B[34m";
            case PURPLE -> "\u001B[35m";
            case CYAN -> "\u001B[36m";
            case BRIGHT_RED -> "\u001B[91m";
            case BRIGHT_GREEN -> "\u001B[92m";
            case BRIGHT_YELLOW -> "\u001B[93m";
            case BRIGHT_BLUE -> "\u001B[94m";
            case BRIGHT_MAGENTA -> "\u001B[95m";
            case BRIGHT_CYAN -> "\u001B[96m";
            case RESET -> "\u001B[0m";
            default -> "\u001B[0m";
        };
    }

    private static String getAnsiBackgroundString(BACKGROUNDS background) {
        return switch (background) {
            case BLACK -> "\u001B[40m";
            case RED -> "\u001B[41m";
            case GREEN -> "\u001B[42m";
            case YELLOW -> "\u001B[43m";
            case BLUE -> "\u001B[44m";
            case PURPLE -> "\u001B[45m";
            case CYAN -> "\u001B[46m";
            case WHITE -> "\u001B[47m";
            default -> "\u001B[0m";
        };
    }
}
