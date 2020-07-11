import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {

	//1. Create an instance of an ArrayList of String called employeeNames
		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Frank Sinatra");
		employeeNames.add("Elvis Preseley");
		employeeNames.add("Toucan Sam");
		employeeNames.add("Jimmy Dean");
		employeeNames.add("Mrs. Doubtfire");
		
	//2. Create an instance of a HashSet of Integer called ids
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(114920);
		ids.add(114908);
		ids.add(114980);
		ids.add(114923);
		ids.add(114972);
		
	//3. Create an instance of a HashMap of Integer, String called employeeMap
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
	//5.
		int i = 0;
		for (int id : ids) {
			employeeMap.put(id, employeeNames.get(i));
			i ++;
		}

	//6.
		for (int k : employeeMap.keySet()) {
			System.out.println(k + " = " + employeeMap.get(k));
		}
		
	//7. Create a StringBuilder called idsBuilder.
		StringBuilder idsBuilder = new StringBuilder();
		
	//8. Iterate over the ids HashSet and append each id, followed by a dash “-“ to idsBuilder.
		for (int id : ids) {
			idsBuilder.append(id + "-");
		}
		
	//9. Print the result of idsBuilder.toString() to the console.
		System.out.println(idsBuilder.toString());
		
	//10. Create another StringBuilder called namesBuilder.
		StringBuilder namesBuilder = new StringBuilder();
		
	//11. Iterate over the employeeNames ArrayList and append each name, followed by a space “ “ to the namesBuilder.
		for (String name : employeeNames) {
			namesBuilder.append(name + " ");
		}
	//12. Print the result of namesBuilder.toString() to the console.
		System.out.println(namesBuilder.toString());
	}
}
