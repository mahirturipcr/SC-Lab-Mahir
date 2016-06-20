package Task;
/**
 * @since Monday June 20,2016
 * @author Mahir Toori
 *
 */
public class Person {
	private String name;
	private double salary;
	/**
	 * 
	 * @param name
	 * @param salary
	 */
	public Person(String name,double salary)
	{
		this.name=name;
		this.salary = salary;
	}
/**
 * 
 * @return
 */
	public String getName() {
		return name;
	}
/**
 * 
 * @param name
 */
	public void setName(String name) {
		this.name = name;
	}
/**
 * 
 * @return
 */
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	/**
	 * 
	 */
}
