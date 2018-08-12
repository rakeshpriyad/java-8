package raj.aayush.after.jdk8.map;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import raj.aayush.dto.Staff;
import raj.aayush.dto.StaffPublic;

public class MapAfterJava8 {
	public static List<String> listOfStringToUpperCase(List<String> stringList) {
		return stringList.stream().map(String::toUpperCase).collect(Collectors.toList());
	}

	public static List<Integer> convertListToSquare(List<Integer> numList) {
		return numList.stream().map(n -> n * n).collect(Collectors.toList());
	}

	public static List<String> getStringList() {
		List<String> alpha = Arrays.asList("a", "b", "c", "d");
		return alpha;
	}

	public static List<Integer> getNumList() {
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
		return num;
	}

	public static List<String> getStaffNameList(List<Staff> staffs) {
		return staffs.stream().map(s -> s.getName()).collect(Collectors.toList());
	}

	public static List<StaffPublic> convertToStaffPublic(List<Staff> staffs) {

      /*  List<StaffPublic> result = new ArrayList<>();

        for (Staff temp : staff) {

            StaffPublic obj = new StaffPublic();
            obj.setName(temp.getName());
            obj.setAge(temp.getAge());
            if ("mkyong".equals(temp.getName())) {
                obj.setExtra("this field is for mkyong only!");
            }

            result.add(obj);
        }*/
		List<StaffPublic> spList =staffs.stream().map(s -> {
			StaffPublic sp = new StaffPublic();
			sp.setAge(s.getAge());
			sp.setName(s.getName());
			if("Ravi".equals(s)) {
				sp.setExtra("Ravi extra field");
			}
			
			return sp;
		}).collect(Collectors.toList());

        return spList;

    }

	public List<Staff> getStafs() {
		List<Staff> staffs = Arrays.asList(new Staff("mkyong", 30, new BigDecimal(10000)),
				new Staff("jack", 27, new BigDecimal(20000)), new Staff("lawrence", 33, new BigDecimal(30000)));
		return staffs;
	}
}
