package raj.aayush.after.jdk8.groupby;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import raj.aayush.dto.Item;

public class GroupByExample {

	public static void main(String[] args) {
		System.out.println(groupByCount(getStringList()));
	}

	public static Map<String, Long> groupByCount(List<String> strList) {
		Map<String, Long> result = strList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		return result;
	}

	public static Map<String, Long> groupByCountByItemName(List<Item> items) {
		Map<String, Long> result = items.stream().collect(Collectors.groupingBy(Item::getName, Collectors.counting()));
		return result;
	}

	public static Map<String, Integer> groupBySumQty(List<Item> items) {
		Map<String, Integer> sum = items.stream()
				.collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));
		return sum;
	}
	
	public static Map<BigDecimal,List<Item>> groupByPriceMap(List<Item> items){
		//group by price
        Map<BigDecimal, List<Item>> groupByPriceMap = 
			items.stream().collect(Collectors.groupingBy(Item::getPrice));
        return groupByPriceMap;
	}
	public static Map<BigDecimal,Set<String>> groupByPriceMapConvertString(List<Item> items){
		//group by price
        Map<BigDecimal, Set<String>> groupByPriceMap = 
			items.stream().collect(Collectors.groupingBy(Item::getPrice,Collectors.mapping(Item::getName, Collectors.toSet())));
        return groupByPriceMap;
	}

	public static List<String> getStringList() {
		List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
		return items;
	}

	public static List<Item> getItemList() {
		List<Item> items = Arrays.asList(new Item("apple", 10, new BigDecimal("9.99")),
				new Item("banana", 20, new BigDecimal("19.99")), new Item("orang", 10, new BigDecimal("29.99")),
				new Item("watermelon", 10, new BigDecimal("29.99")), new Item("papaya", 20, new BigDecimal("9.99")),
				new Item("apple", 10, new BigDecimal("9.99")), new Item("banana", 10, new BigDecimal("19.99")),
				new Item("apple", 20, new BigDecimal("9.99")));
		return items;
	}
}
