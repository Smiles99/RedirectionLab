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
        if (s.length() == 1) {
            latinized = s + "ay";
        } else {
            if(Character.isLetter(s.charAt(x))) {
                String hold1 = "";
                String hold2 = "";
                hold1 = "" + s.charAt(x);
                hold1 = hold1.toLowerCase();
                s = hold1 + s.substring(1);
                if(s.length() >= 3 && (s.charAt(x) == 'b' && (s.charAt(y) == 'l' || s.charAt(y) == 'r')) ||
                        (s.charAt(x) == 'c' && (s.charAt(y) == 'h' || s.charAt(y) == 'k' || s.charAt(y) == 'l' || s.charAt(y) == 'r')) ||
                        (s.charAt(x) == 'd' && s.charAt(y) == 'r') ||
                        (s.charAt(x) == 'f' && (s.charAt(y) == 'l' || s.charAt(y) == 'r')) ||
                        (s.charAt(x) == 'g' && (s.charAt(y) == 'h' || s.charAt(y) == 'l' || s.charAt(y) == 'r')) ||
                        (s.charAt(x) == 'n' && s.charAt(y) == 'g') ||
                        (s.charAt(x) == 'p' && (s.charAt(y) == 'h' || s.charAt(y) == 'l' || s.charAt(y) == 'r')) ||
                        (s.charAt(x) == 'q' && s.charAt(y) == 'u') ||
                        (s.charAt(x) == 's' && (s.charAt(y) == 'c' || s.charAt(y) == 'h' || s.charAt(y) == 'k' || s.charAt(y) == 'l' || s.charAt(y) == 'm' ||
                                s.charAt(y) == 'n' || s.charAt(y) == 'p' || s.charAt(y) == 't' || s.charAt(y) == 'w'))) {
                    hold1 = "" + s.charAt(x) + s.charAt(y);
                    if (!(Character.isLetter(s.charAt(s.length() - 1))) && !(Character.isDigit(s.charAt(s.length() - 1)))) {
                        hold2 = "" + s.charAt(s.length() - 1);
                        s = s.substring(2, s.charAt(s.length() - 1));
                        latinized = s + hold1 + "ay" + hold2;
                    }
                } else {
                    if (s.charAt(x) == 'a' || s.charAt(x) == 'e' || s.charAt(x) == 'i' || s.charAt(x) == 'o' || s.charAt(x) == 'u') {
                        if (!(Character.isLetter(s.charAt(s.length() - 1))) && !(Character.isDigit(s.charAt(s.length() - 1)))) {
                            hold2 = "" + s.charAt(s.length() - 1);
                            s = s.substring(0, s.charAt(s.length() - 1));
                            latinized = s +  "hay" + hold2;
                        }
                    } else {
                        hold1 = "" + s.charAt(x);
                        s = s.substring(1);
                        latinized = s + hold1 + "ay";
                    }
                }
            } else {
                latinized = s;
            }
        }
        return latinized;
    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        while (n.hasNextLine()) {
            String line = n.nextLine();
            String output = "";
            Scanner m = new Scanner(line);
            while (m.hasNext()) {
                String input = m.next();
                int x = 0;
                String hold = "";
                hold = pigLatinBest(input);
                output = output + hold + " ";
            }
            m.close();
            System.out.println(output);
        }
        n.close();
    }
}
