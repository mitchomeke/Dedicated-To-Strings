import java.util.Scanner;

public class Main {
    /**
     * CHECKING IF A WORD´S LENGTH IS EVEN.
     * @param args
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str2;
        String str3;
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                j = i;
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < j; i++) {
            builder.append(str.charAt(i));
        }
        StringBuilder builder1 = new StringBuilder();
        str2 = builder.toString();
        while (j < str.length()){
            builder1.append(str.charAt(j));
            j++;
        }
        str3 = builder1.toString();
        if (str2.length() % 2 == 0){
            System.out.println(str2 + " has an even length of words.");
        }
        else if (str3.length() % 2 == 0){
            System.out.println(str3 + " has an even length of words.");
        }
    }
}