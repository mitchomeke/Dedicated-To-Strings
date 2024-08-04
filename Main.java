import java.util.Scanner;

public class Main {
    /**
     * PALINDROME STRINGS
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        String reversed = "";

        StringBuilder builder = new StringBuilder();
        int i = input.length()-1;
        while(i >= 0){
            builder.append(input.charAt(i));
            i--;
        }

        reversed = builder.toString().toUpperCase();
        for (int j = 0; j < input.length();j++){
            if (input.charAt(j) != reversed.charAt(j)){
                System.out.println("Not a palindrome");
                break;
            }
            else {
                System.out.println("It´s a Palindrome");
                return;
            }
        }
    }
}