package raj.aayush.after.jdk8.filter;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import raj.aayush.dto.Person;

public class FilterAfterJava8Test {

	@Test
    public void testFindPersonByName() {
		Person p =FilterAfterJava8.findPersonByName(getPersons(), "Ravi");
		Assert.assertEquals("Ravi", p.getName());
	}

	
	@Test
	public void testFindByPersonN() {
		Person p =FilterAfterJava8.findPersonByName(getPersons(), "NRavi");
		Assert.assertNull(p);
	}

	@Test
    public void testFindPersonByNameAndAge() {
		Person p =FilterAfterJava8.findPersonByNameAndAge(getPersons(), "Ravi",20);
		Assert.assertEquals("Ravi", p.getName());
	}
	
	@Test
    public void testFindPersonByNameAndAgeN() {
		Person p =FilterAfterJava8.findPersonByNameAndAge(getPersons(), "Ravi",40);
		Assert.assertNull(p);
	}
	
	
    public Person findPersonByName(List<Person> persons, String name) {
    	if(name == null ) {
    		return null;
    	}
    	return persons.stream().filter(p -> name.equals(p.getName())).findAny().orElse(null);
    }

    private List<Person> getPersons() {
		return Arrays.asList(new Person("Ravi", 30), new Person("jack", 20), 		new Person("lawrence", 40));
	}
}
