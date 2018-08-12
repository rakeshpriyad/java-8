package raj.aayush.before.jdk8.foreach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import raj.aayush.dto.Developer;

public class ForeEachJava8 {

	
	public static void main(String[] args) {
		forEachMap(getDevelopers());
		forEachList();
	}
	
	public static void forEachList() {
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		for(String item : items){
			System.out.println(item);
		}
	}
	private static List<Developer> getDevelopers() {
		List<Developer> result = new ArrayList<Developer>();
		result.add(new Developer("aayush", new BigDecimal("70000"), 33));
		result.add(new Developer("raj", new BigDecimal("100000"), 20));
		result.add(new Developer("mahto", new BigDecimal("80000"), 10));
		result.add(new Developer("sweta", new BigDecimal("170000"), 55));
		return result;
	}
	public static void forEachMap(List<Developer> listDevs) {
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}
	}
}
