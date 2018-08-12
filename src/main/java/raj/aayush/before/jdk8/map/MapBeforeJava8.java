package raj.aayush.before.jdk8.map;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import raj.aayush.dto.Staff;
import raj.aayush.dto.StaffPublic;

public class MapBeforeJava8 {

	public static List<StaffPublic> convertToStaffPublic(List<Staff> staff) {
		List<StaffPublic> result = new ArrayList<>();

		for (Staff temp : staff) {

			StaffPublic obj = new StaffPublic();
			obj.setName(temp.getName());
			obj.setAge(temp.getAge());
			if ("Ravi".equals(temp.getName())) {
				obj.setExtra("this field is for mkyong only!");
			}
			result.add(obj);
		}
		return result;

	}

	public List<Staff> getStafs() {
		List<Staff> staffs = Arrays.asList(new Staff("Ravi", 30, new BigDecimal(10000)),
				new Staff("jack", 27, new BigDecimal(20000)), new Staff("lawrence", 33, new BigDecimal(30000)));
		return staffs;
	}
}
