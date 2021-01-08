import java.util.Scanner;

public class MakeStars {
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
                while (x < input.length()) {
                    hold = hold + "*";
                    x++;
                }
                output = output + hold + " ";
            }
            m.close();
            System.out.println(output);
        }
        n.close();
    }
}
