import java.util.Scanner;

public class MakeStars {
    public static void main(String[] args) {
        Scanner n = new Scanner( System.in );
        String output = "";
        String hold = "";
        while (n.hasNextLine()) {
            n.nextLine();
            while (n.hasNext()) {
                String input = n.next();
                int x = 0;
                hold = "";
                while (x < input.length()) {
                    hold = hold + "*";
                }
                hold = hold + " ";
            }
            output = output + hold;
            System.out.println(output);
        }
    }
}
