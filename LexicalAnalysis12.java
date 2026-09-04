package Day9IOT;
import java.util.*;
public class LexicalAnalysis12 {
    public static void main(String[] args) {
        String[] numbers = {
        		"8431160502",
        		"9740075072", 
        		"7259724133",
        		"1234567890",
        		"9874561230"
        		};
        String search = "8431";
        ArrayList<String	> result = new ArrayList<>();
        for (String number : numbers) {
            if (String.valueOf(number).contains(String.valueOf(search))) {
                result.add(number);
            }
        }
        System.out.println("Search results:");
        for (String number : result) {
            System.out.println(number);
        }
    }
}