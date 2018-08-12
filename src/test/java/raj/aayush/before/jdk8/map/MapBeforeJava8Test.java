package raj.aayush.before.jdk8.map;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import raj.aayush.dto.Staff;
import raj.aayush.dto.StaffPublic;

public class MapBeforeJava8Test {

	@Test
	public void testConvertToStaffPublic() {
		List<StaffPublic> spList =MapBeforeJava8.convertToStaffPublic(getStafs());
		Assert.assertNotNull(spList);

	}

	public List<Staff> getStafs() {
		List<Staff> staffs = Arrays.asList(new Staff("Ravi", 30, new BigDecimal(10000)),
				new Staff("jack", 27, new BigDecimal(20000)), new Staff("lawrence", 33, new BigDecimal(30000)));
		return staffs;
	}
}
