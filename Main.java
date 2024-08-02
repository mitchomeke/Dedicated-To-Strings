import java.util.Scanner;

public class Main {
    /**
     * NUMBER OF WORDS IN A STRING
     * @param args
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split(" ");
        int i = 0;
        for (int j = 0; j < array.length;j++){
            i++;
        }
        System.out.println(i);
    }
}