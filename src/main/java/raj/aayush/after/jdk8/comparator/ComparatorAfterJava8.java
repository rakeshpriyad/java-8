package raj.aayush.after.jdk8.comparator;

import java.util.Collections;
import java.util.List;

import raj.aayush.dto.Developer;

public class ComparatorAfterJava8 {

	public void sortByAge(List<Developer> listDevs) {
		// sort by age
		//Collections.sort(listDevs, (Developer o1, Developer o2)->o1.getAge()-o2.getAge());
	//	Collections.sort(listDevs, (d1, d2)->d1.getAge()-d2.getAge());
		Collections.sort(listDevs, (d1, d2)-> { return d1.getAge()>d2.getAge() ? 1 : (d1.getAge()<d2.getAge() ? -1:0);});
	}

	public void sortByName(List<Developer> listDevs) {
		// lambda
		// listDevs.sort((Developer o1, Developer
		// o2)->o1.getName().compareTo(o2.getName()));

		// lambda
		listDevs.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
	}

	public void sortBySalary(List<Developer> listDevs) {
		// sort by salary
		// lambda
		// listDevs.sort((Developer o1, Developer
		// o2)->o1.getSalary().compareTo(o2.getSalary()));

		// lambda
		listDevs.sort((o1, o2) -> o1.getSalary().compareTo(o2.getSalary()));
	}
}
