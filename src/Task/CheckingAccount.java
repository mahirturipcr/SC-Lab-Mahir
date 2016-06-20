package Task;
/**
 * @since Monday June 20,2016
 * @author Mahir Toori
 *
 */
public class CheckingAccount extends Account {
	/**
	 * CheckingAccount extends Account class
	 * 
	 */
private double chargeRate;
	/**
	 * class for account
	 * 
	 */
	@Override
	public boolean withdraw(double amount) {

		return false;
	}
	/**
	 * 
	 * @param chargeRate
	 * @param no
	 * @param o
	 */
	public CheckingAccount(double chargeRate, double no, Person o) {
		super();
		this.chargeRate = chargeRate;
	}
	/**
	 * Method for payCharge in which person will pay 
	 */
	public void payCharge()
	{
		
	}

	
}

	


