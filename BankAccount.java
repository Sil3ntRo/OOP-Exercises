
public class BankAccount implements IRate {
	String accountNumber;
	//Static belongs to the CLASS not the object instance
	//final is our constant often static final
	static final String routingNumber = "3383274627";
	String accountType;
	String name;
	String ssn;
	double balance;
	
	//Constructor definitions: unique methods
	// Used to define / setup / initialize properties of an object
	//Same name of the class itself
	//Constructors cannot have NO return type
	
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit) {
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
		String Msg = null;
		if(initDeposit < 1000) {
			Msg = "ERROR: Minimum deposit of: $" + initDeposit;
		}
		else {
			Msg = "Thanks for your initial deposit of: $" + initDeposit;
		}
		System.out.println(Msg);
		balance = initDeposit;
	}
	
	//Interface methods
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	
	public void increaseRate() {	
		System.out.println("INCREASING RATE");
	}
	
	void deposit() {
		
	}
	
	void withdraw() {
		
	}
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ " + name + ". " + accountNumber + ". Balance: $" + balance + " ]";
	}
	
}
