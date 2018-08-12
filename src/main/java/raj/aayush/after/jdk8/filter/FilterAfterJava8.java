package raj.aayush.after.jdk8.filter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import raj.aayush.dto.Person;

public class FilterAfterJava8 {

    public static void main(String[] args) {

        List<String> lines = Arrays.asList("spring", "node", "rest");
        List<String> result = lines.stream().filter(s -> !s.contains("rest")).collect(Collectors.toList());
        for (String temp : result) {
            System.out.println(temp);    //output : spring, node
        }
    }

    public static Person findPersonByName(List<Person> persons, String name) {
    	if(name == null ) {
    		return null;
    	}
    	return persons.stream().filter(p -> name.equals(p.getName())).findAny().orElse(null);
    }
    
    public static Person findPersonByNameAndAge(List<Person> persons, String name, int age) {
    	if(name == null ) {
    		return null;
    	}
    	return persons.stream().filter(p -> name.equals(p.getName()) &&  p.getAge() > age).findAny().orElse(null);
    }

}
