package raj.aayush.after.jdk8.filter.map;
import java.util.List;

import raj.aayush.dto.Person;

public class FilterMapAfterJava8 {
    public static String findPersonNameByAge(List<Person> persons, int age) {
    	return persons.stream().filter(p -> p.getAge() == age).map(Person::getName).findAny().orElse("");
    }

}
