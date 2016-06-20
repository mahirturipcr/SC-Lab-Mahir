package Task;
/**
 * @since Monday June 20,2016
 * @author Mahir Toori
 *
 */
public class SavingAccount extends Account {

	/**
	 * SavingAccount extends Account class
	 * in this class we implements two methods for account and interestRate
	 * 
	 */
	
	private double interestRate;
	@Override
	
	public boolean withdraw(double amount) {
		/**
		 * if the amount is false then return false
		 */
	
		return false;
		
	}
	/**
	 * 
	 * @param interestRate
	 * @param no
	 * @param owner
	 */
	public SavingAccount(double interestRate , int no, Person owner) {
		super();
		this.interestRate = interestRate;
	}
	/**
	 * method of addInterest
	 */
	public void addInterset()
	{
		
	}

}

	
	
	
	

