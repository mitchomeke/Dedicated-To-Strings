import java.util.*;

public class Main {
    /**
     * FINDING THE FIRST NON REPEATED CHARACTER IN A STRING
     * @param args
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (Character ch: input.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                System.out.println(entry.getKey());
                return;
            }
        }
    }
}