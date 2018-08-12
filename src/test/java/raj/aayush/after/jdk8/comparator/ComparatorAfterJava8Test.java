package raj.aayush.after.jdk8.comparator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import raj.aayush.dto.Developer;

public class ComparatorAfterJava8Test {

	@Test
	public void testSortByAge() {
		List<Developer> listDevs = getDevelopers();
		ComparatorAfterJava8 obj = new ComparatorAfterJava8();
		obj.sortByAge(listDevs);
		Assert.assertEquals(20, listDevs.get(1).getAge());
		Assert.assertEquals(33, listDevs.get(2).getAge());
	}

	@Test
	public void testSortByName() {
		List<Developer> listDevs = getDevelopers();
		ComparatorAfterJava8 obj = new ComparatorAfterJava8();
		obj.sortByName(listDevs);
		Assert.assertEquals("mahto", listDevs.get(1).getName());
		Assert.assertEquals("raj", listDevs.get(2).getName());
	}

	@Test
	public void testSortBySalary() {
		List<Developer> listDevs = getDevelopers();
		ComparatorAfterJava8 obj = new ComparatorAfterJava8();
		obj.sortBySalary(listDevs);
		Assert.assertEquals(new BigDecimal("80000"), listDevs.get(1).getSalary());
		Assert.assertEquals(new BigDecimal("100000"), listDevs.get(2).getSalary());
	}

	private static List<Developer> getDevelopers() {
		List<Developer> result = new ArrayList<Developer>();
		result.add(new Developer("aayush", new BigDecimal("70000"), 33));
		result.add(new Developer("raj", new BigDecimal("100000"), 20));
		result.add(new Developer("mahto", new BigDecimal("80000"), 10));
		result.add(new Developer("sweta", new BigDecimal("170000"), 55));
		return result;
	}

}
