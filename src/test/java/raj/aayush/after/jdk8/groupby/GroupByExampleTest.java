package raj.aayush.after.jdk8.groupby;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import raj.aayush.dto.Item;

public class GroupByExampleTest {

	@Test
	public void testGroupByCount() {
		Map<String, Long> result = GroupByExample.groupByCount(GroupByExample.getStringList());
		System.out.println(result);
		Assert.assertNotNull(result);

		Map<String, Long> finalMap = new LinkedHashMap<>();
		// Sort a map and add to finalMap
		result.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
				.forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
		System.out.println(finalMap);
	}

	@Test
	public void testGroupByCountByItemName() {
		Map<String, Long> result = GroupByExample.groupByCountByItemName(GroupByExample.getItemList());
		System.out.println("testGroupByCountByItemName result " + result);
		Assert.assertNotNull(result);
	}

	@Test
	public void testGroupBySumQty() {
		Map<String, Integer> result = GroupByExample.groupBySumQty(GroupByExample.getItemList());
		System.out.println("testGroupBySumQty result " + result);
		Assert.assertNotNull(result);
	}

	@Test
	public void testGroupByPriceMap() {
		Map<BigDecimal, List<Item>> result = GroupByExample.groupByPriceMap(GroupByExample.getItemList());
		System.out.println("testGroupByPriceMap result " + result);
		Assert.assertNotNull(result);
	}
	
	
	@Test
	public void testGroupByPriceMapConvertString() {
		Map<BigDecimal, Set<String>> result = GroupByExample.groupByPriceMapConvertString(GroupByExample.getItemList());
		System.out.println("testGroupByPriceMap result " + result);
		Assert.assertNotNull(result);
	}
	
	
}
