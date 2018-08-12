package raj.aayush.before.jdk8.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import raj.aayush.dto.Developer;

public class ComparatorBeforeJava8 {

	public void sortByAge(List<Developer> listDevs) {
		// sort by age
		Collections.sort(listDevs, new Comparator<Developer>() {
			public int compare(Developer o1, Developer o2) {
				return o1.getAge() - o2.getAge();
			}
		});
	}

	public void sortByName(List<Developer> listDevs) {
		Collections.sort(listDevs, new Comparator<Developer>() {
			public int compare(Developer o1, Developer o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
	}

	public void sortBySalary(List<Developer> listDevs) {
		// sort by salary
		Collections.sort(listDevs, new Comparator<Developer>() {
			public int compare(Developer o1, Developer o2) {
				return o1.getSalary().compareTo(o2.getSalary());
			}
		});
	}
}
