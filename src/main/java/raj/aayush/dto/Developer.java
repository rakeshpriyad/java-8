package raj.aayush.dto;

import java.math.BigDecimal;

public class Developer {

	private Integer age;
	private String name;
	private BigDecimal salary;

	public Developer(String name, BigDecimal salary, int age) {
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

	public int getAge() {
		return this.age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Developer [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}

}
