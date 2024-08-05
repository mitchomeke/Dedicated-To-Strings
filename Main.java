import java.util.*;

public class Main {
    /**
     * SORTING CHARACTERS IN DESCENDING ORDER OF THEIR FREQUENCY
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for (Character ch : input.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character,Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((entry1,entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        for (Map.Entry<Character,Integer> entry : entryList){
         System.out.println("The frequency of character " + entry.getKey() + " is " + entry.getValue());
        }
    }
}