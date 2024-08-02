import java.util.ArrayList;
import java.util.Scanner;

/**
 * COMPARING TWO STRINGS
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String input2 = scanner.nextLine();

        int j = 0;
        char c;
        char b;

        if (input.length() == input2.length()) {
            for (int i = 0; i < input.length(); i++) {
                c = input.charAt(i);
                b = input2.charAt(j);
                j++;
                if (c != b) {
                    System.out.println("Not equal Strings");
                    break;
                }
                else if (i == input.length()-1){
                    System.out.println("Equal Strings");
                }
            }
        }
    }
}