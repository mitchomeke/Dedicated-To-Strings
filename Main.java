import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        if (str1.length() == str2.length()){
            ArrayList<Character> array = new ArrayList<>();
                for (int i = 0; i < str1.length();i++){
                    array.add(str1.charAt(i));
            }
                for (int i = 0; i < str2.length();i++){
                    Character c = str2.charAt(i);
                    if (array.contains(c)){
                        array.remove(c);
                    }
                }
                if (array.isEmpty()){
                    System.out.println("It´s an anagram");
                }
                else {
                    System.out.println("It´s not an anagram!");
                }
        }
        else {
            System.out.println("Don´t even bother lol!");
        }
    }
}