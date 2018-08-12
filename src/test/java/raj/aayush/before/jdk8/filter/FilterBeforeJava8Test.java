package raj.aayush.before.jdk8.filter;

import org.junit.Assert;
import org.junit.Test;

import raj.aayush.before.jdk8.filter.FilterBeforeJava8;
import raj.aayush.dto.Person;

public class FilterBeforeJava8Test {

	@Test
	public void testPersonByName() {
		Person p =FilterBeforeJava8.getPersonByName(FilterBeforeJava8.getPersons(),"Ravi");
		Assert.assertEquals("Ravi", p.getName());
	}

}
