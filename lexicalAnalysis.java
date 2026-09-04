package Day9IOT;
import java.util.*;
public class lexicalAnalysis {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {
				"Ravi",
				"Rahul",
				"Anand",
				"Rakesh",
				"Raj",
		};
		String search = "An";
		ArrayList<String> result = new ArrayList<>();
		for (String name : names) {
			if (name.contains(search)) {
				result.add(name);
			}
		}
		System.out.println("Search results:");
		for (String name : result) {
			System.out.println(name);
		}

	}

}
