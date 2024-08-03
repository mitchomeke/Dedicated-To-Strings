import java.util.Scanner;

public class Main {
    /**
     * FINDING THE NUMBER OF CHARACTERS IN EACH WORD IN A STRING
     * @param args
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] str = input.split(" ");
        for (String s : str) {
            System.out.println(s + "->" + s.length());
        }
    }
}