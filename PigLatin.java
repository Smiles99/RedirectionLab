public class PigLatin {
    public static String pigLatinSimple(String s){
        int x = 0;
        String latinized = "";
        if (s.charAt(x) == 'a' || s.charAt(x) == 'e' || s.charAt(x) == 'i' || s.charAt(x) == 'o' || s.charAt(x) == 'u') {
            latinized = s + "hay";
        } else {
            char hold = ' ';
            hold = s.charAt(x);
            s = s.substring(1);
            latinized = s + hold + "ay";
        }
        return latinized;
    }

    public static String pigLatin(String s){
        int x = 0;
        int y = 1;
        String latinized = "";
        if(s.length() >= 2 && (s.charAt(x) == 'b' && (s.charAt(y) == 'l' || s.charAt(y) == 'r')) ||
                (s.charAt(x) == 'c' && (s.charAt(y) == 'h' || s.charAt(y) == 'k' || s.charAt(y) == 'l' || s.charAt(y) == 'r')) ||
                (s.charAt(x) == 'd' && s.charAt(y) == 'r') ||
                (s.charAt(x) == 'f' && (s.charAt(y) == 'l' || s.charAt(y) == 'r')) ||
                (s.charAt(x) == 'g' && (s.charAt(y) == 'h' || s.charAt(y) == 'l' || s.charAt(y) == 'r')) ||
                (s.charAt(x) == 'n' && s.charAt(y) == 'g') ||
                (s.charAt(x) == 'p' && (s.charAt(y) == 'h' || s.charAt(y) == 'l' || s.charAt(y) == 'r')) ||
                (s.charAt(x) == 'q' && s.charAt(y) == 'u') ||
                (s.charAt(x) == 's' && (s.charAt(y) == 'c' || s.charAt(y) == 'h' || s.charAt(y) == 'k' || s.charAt(y) == 'l' || s.charAt(y) == 'm' ||
                        s.charAt(y) == 'n' || s.charAt(y) == 'p' || s.charAt(y) == 't' || s.charAt(y) == 'w'))) {
            String hold = "";
            hold = s.charAt(x) + s.charAt(y);
            s = s.substring(2);
            latinized = s + hold + "ay";
        } else {
            if (s.charAt(x) == 'a' || s.charAt(x) == 'e' || s.charAt(x) == 'i' || s.charAt(x) == 'o' || s.charAt(x) == 'u') {
                latinized = s + "hay";
            } else {
                char hold = ' ';
                hold = s.charAt(x);
                s = s.substring(1);
                latinized = s + hold + "ay";
            }
        }
        return latinized;
    }
}
