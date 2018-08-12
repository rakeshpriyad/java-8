package raj.aayush.after.jdk8.groupby;

import static java.util.stream.Collectors.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupByExampleMultiLevel {

	public static void main(String[] args) {
		test();
		twoLevelGrouping(getPersons());
		threeLevelGrouping(getPersons());
	}

	public static void test() {
		List<Persons> p =getPersons();
		Map<String,List<Persons>> px=p.stream().collect(Collectors.groupingBy( pp ->pp.getName()));
		System.out.println(px);
	}
	public static void twoLevelGrouping(List<Persons> persons) {
		final Map<String, Map<String, List<Persons>>> personsByCountryAndCity = persons.stream()
				.collect(groupingBy(Persons::getCountry, groupingBy(Persons::getCity)));
		System.out.println("Persons living in London: " + personsByCountryAndCity.get("UK").get("London").size());
		System.out.println("Persons living in London: " + personsByCountryAndCity.get("USA"));
	}

	public static void threeLevelGrouping(List<Persons> persons) {
		final Map<String, Map<String, Map<String, List<Persons>>>> personsByCountryCityAndPetName = persons.stream()
				.collect(groupingBy(Persons::getCountry, groupingBy(Persons::getCity, groupingBy(p -> p.getPet().getName()))));
		System.out.println("Persons whose pet is named 'Max' and live in NY: "
				+ personsByCountryCityAndPetName.get("USA").get("NYC").get("Max").size());
		System.out.println(personsByCountryCityAndPetName.get("USA").get("NYC"));
	}
	
	public void threeLevelGrouping1(List<Persons> persons) {
		final Map<String, Map<String, Map<String, List<Persons>>>> personsByCountryCityAndPetName = persons.stream()
				.collect(groupingBy(Persons::getCountry, groupByCityAndPetName()));
		System.out.println("Persons whose pet is named 'Max' and live in NY: "
				+ personsByCountryCityAndPetName.get("USA").get("NYC").get("Max").size());
	}

	private Collector<Persons, ?, Map<String, Map<String, List<Persons>>>> groupByCityAndPetName() {
		return groupingBy(Persons::getCity, groupingBy(p -> p.getPet().getName()));
	}

	public static List<Persons> getPersons() {
		Persons person1 = new Persons("John", "USA", "NYC", new Pet("Max", 5));
		Persons person2 = new Persons("Steve", "UK", "London", new Pet("Lucy", 8));
		Persons person3 = new Persons("Anna", "USA", "NYC", new Pet("Buddy", 12));
		Persons person4 = new Persons("Mike", "USA", "Chicago", new Pet("Duke", 10));

		List<Persons> persons = Arrays.asList(person1, person2, person3, person4);

		return persons;
	}

}
