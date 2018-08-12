package raj.aayush.after.jdk8.foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ForeEachJava8 {

	
	public static void main(String[] args) {
		forEachMap();
		forEachKey();
		forEachValue();
	}
	
	public void forEachList() {
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		//lambda
		//Output : A,B,C,D,E

		items.forEach(a -> System.out.println(a));
		//Output : C
		items.forEach(a -> {
			if("C".equals(a)) {
				System.out.println(a);
			}
		});
			
		//method reference
		//Output : A,B,C,D,E
		items.forEach(System.out:: println);
		//Stream and filter
		//Output : B
		items.stream().filter(a -> a.contains("B")).forEach(System.out::print);
	}
	
	public static void forEachKey() {
		ConcurrentHashMap<String,Integer> items = getConcurrentMap();
		items.forEachKey(items.size(), System.out::println);
	}
	public static void forEachValue() {
		ConcurrentHashMap<String,Integer> items = getConcurrentMap();
		items.forEachValue(items.size(), System.out::println);
	}
	public static void forEachMap() {
		Map<String, Integer> items = getMap();
		
		items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
		
		items.forEach((k,v)->{
			System.out.println("Item : " + k + " Count : " + v);
			if("E".equals(k)){
				System.out.println("Hello E");
			}
		});
	}

	private static Map<String, Integer> getMap() {
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		return items;
	}
	
	private static ConcurrentHashMap<String, Integer> getConcurrentMap() {
		ConcurrentHashMap<String, Integer> items = new ConcurrentHashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		return items;
	}
}
