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
}
