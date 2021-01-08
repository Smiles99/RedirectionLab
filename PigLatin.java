import java.util.*;

public class PigLatin {
    public static String pigLatinSimple(String s){
        int x = 0;
        String latinized = "";
        String hold = "";
        if (s.charAt(x) == 'a' || s.charAt(x) == 'e' || s.charAt(x) == 'i' || s.charAt(x) == 'o' || s.charAt(x) == 'u') {
            latinized = s + "hay";
        } else {
            if (s.charAt(x) == 'A' || s.charAt(x) == 'E' || s.charAt(x) == 'I' || s.charAt(x) == 'O' || s.charAt(x) == 'U') {
                hold = "" + s.charAt(x);
                hold = hold.toLowerCase();
                s = s.substring(1);
                latinized = hold + s + "hay";
            } else {
                hold = "" + s.charAt(x);
                hold = hold.toLowerCase();
                s = s.substring(1);
                latinized = s + hold + "ay";
            }
        }
        return latinized;
    }

    public static String pigLatin(String s){
        int x = 0;
        int y = 1;
        String latinized = "";
        String hold = "";
        hold = "" + s.charAt(x);
        hold = hold.toLowerCase();
        s = hold + s.substring(1);
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
            hold = "" + s.charAt(x) + s.charAt(y);
            s = s.substring(2);
            latinized = s + hold + "ay";
        } else {
            if (s.charAt(x) == 'a' || s.charAt(x) == 'e' || s.charAt(x) == 'i' || s.charAt(x) == 'o' || s.charAt(x) == 'u') {
                latinized = s + "hay";
            } else {
                hold = "" + s.charAt(x);
                s = s.substring(1);
                latinized = s + hold + "ay";
            }
        }
        return latinized;
    }

    public static String pigLatinBest(String s){
      int x = 0;
      int y = 1;
      String latinized = "";
      if(s.isLetter(s.charAt(x))) {
        String hold = "";
        hold = "" + s.charAt(x);
        hold = hold.toLowerCase();
        s = hold + s.substring(1);
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
            hold = "" + s.charAt(x) + s.charAt(y);
            s = s.substring(2);
            latinized = s + hold + "ay";
        } else {
            if (s.charAt(x) == 'a' || s.charAt(x) == 'e' || s.charAt(x) == 'i' || s.charAt(x) == 'o' || s.charAt(x) == 'u') {
                latinized = s + "hay";
            } else {
                hold = "" + s.charAt(x);
                s = s.substring(1);
                latinized = s + hold + "ay";
            }
        }
      } else {
        latinized = s;
      }
      return latinized;
    }
}
