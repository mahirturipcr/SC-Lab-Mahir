package Task;
/**
 * @since Monday June 20,2016
 * @author Mahir Toori
 * Account class which is abstract class
 */
public abstract class Account {

	/**
	 * two protected values one is int type and another is double
	 */
	
	
	

	protected int number;
	protected double bal;
	/**
	 * 
	 * @return number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * 
	 * @return bal
	 */
	public double getBal() {
		return bal;
	}
	/**
	 * 
	 * @return null
	 */
	public Person getOwner()
	{
		return null;
	}
	/**
	 * 
	 * @param amount
	 */
	public void deposite(double amount)
	{
		
	}
	/**
	 * 
	 * @param amount
	 * @return
	 */
	public abstract boolean withdraw(double amount);

	
	
	
}
