import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int wordcount = 0;
        int vowelcount = 0;
        int uppercasecount = 0;
        String[] array = input.split(" ");
        for (int i = 0 ; i < array.length;i++){
            wordcount++;
        }
        for (Character ch : input.toCharArray()){
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelcount++;
            }
            if (ch >= 65 && ch <=90){
                uppercasecount++;
            }
        }
        System.out.println("word count -> " + wordcount);
        System.out.println("vowel count -> " + vowelcount);
        System.out.println("uppercase count -> " + uppercasecount);
    }
}