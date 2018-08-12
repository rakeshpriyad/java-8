package raj.aayush.after.jdk8.filter.map;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import raj.aayush.dto.Person;

public class FilterAfterJava8Test {

	@Test
    public void testFindPersonByName() {
		String name =FilterMapAfterJava8.findPersonNameByAge(getPersons(), 30);
		Assert.assertEquals("Ravi", name);
	}

	
	@Test
	public void testFindPersonByNameN() {
		String name =FilterMapAfterJava8.findPersonNameByAge(getPersons(), 25);
		Assert.assertEquals("", name);
	}

	
    private List<Person> getPersons() {
		return Arrays.asList(new Person("Ravi", 30), new Person("jack", 20), new Person("lawrence", 40));
	}
}
