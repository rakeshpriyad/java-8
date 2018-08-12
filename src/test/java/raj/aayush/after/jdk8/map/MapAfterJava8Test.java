package raj.aayush.after.jdk8.map;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;

import raj.aayush.dto.Staff;
import raj.aayush.dto.StaffPublic;

public class MapAfterJava8Test {

	@Test
	public void testConvertToStaffPublic() {
		List<StaffPublic> spList =MapAfterJava8.convertToStaffPublic(getStafs());
		Assert.assertNotNull(spList);

	}
	
	@Test
	public void testListOfStringToUpperCase() {
		List<String> spList =MapAfterJava8.listOfStringToUpperCase(MapAfterJava8.getStringList());
		System.out.println(spList);
		Assert.assertNotNull(spList);

	}

	@Test
	public void convertListToSquare() {
		List<Integer> numList =MapAfterJava8.convertListToSquare(MapAfterJava8.getNumList());
		System.out.println(numList);
		Assert.assertNotNull(numList);

	}

	@Test
	public void getStaffNameList() {
		List<String> numList =MapAfterJava8.getStaffNameList(getStafs());
		System.out.println(numList);
		Assert.assertNotNull(numList);
	}

	public List<String> getStaffNameList(List<Staff> staffs) {
		return staffs.stream().map(s -> s.getName()).collect(Collectors.toList());
	}
	public List<Staff> getStafs() {
		List<Staff> staffs = Arrays.asList(new Staff("Ravi", 30, new BigDecimal(10000)),
				new Staff("jack", 27, new BigDecimal(20000)), new Staff("lawrence", 33, new BigDecimal(30000)));
		return staffs;
	}

}
