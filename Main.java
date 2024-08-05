import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    /**
     * IF STRINGS ARE A ROTATION OF EACH OTHER
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String input2 = scanner.nextLine();
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        StringBuilder builder = new StringBuilder();
        String c = "";

        if (input.length() == input2.length()){
            int length = input.length();
            for (int i = 0; i < length;i++){
                String a = input.substring(0,i+1);
                String b = input.substring(i);
                c = b+a;
                if (c.contains(input2)){
                    System.out.println("true");
                    break;
                }
            }
        }
    }
}