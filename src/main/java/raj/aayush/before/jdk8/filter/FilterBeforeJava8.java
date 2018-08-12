package raj.aayush.before.jdk8.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import raj.aayush.dto.Person;

public class FilterBeforeJava8 {

	public static void main(String[] args) {

		List<String> lines = Arrays.asList("spring", "node", "rest");
		List<String> result = getFilterOutput(lines, "rest");
		for (String temp : result) {
			System.out.println(temp); // output : spring, node
		}

	}

	private static List<String> getFilterOutput(List<String> lines, String filter) {
		List<String> result = new ArrayList<>();
		for (String line : lines) {
			if (!filter.equals(line)) { // we dont like mkyong
				result.add(line);
			}
		}
		return result;
	}

	public static Person getPersonByName(List<Person> persons, String name) {

		Person result = null;
		for (Person temp : persons) {
			if (name.equals(temp.getName())) {
				result = temp;
			}
		}
		return result;
	}

	public static List<Person> getPersons() {
		return Arrays.asList(new Person("Ravi", 30), new Person("jack", 20), 		new Person("lawrence", 40));
	}
}
