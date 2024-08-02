import java.util.Scanner;

public class Main {

    /**
     * REVERSING STRINGS
     * @param args
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String output = "";
        String[] array = input1.split("");
        int i = input1.length()-1;
        StringBuilder builder = new StringBuilder();
        while(i >= 0){
            builder.append(input1.charAt(i));
            i--;
        }
        output = builder.toString();
        System.out.println(output);
    }
}