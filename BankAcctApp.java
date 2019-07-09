
public class BankAcctApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "4298229389";
		acc1.name = "Roger Hue";
		acc1.balance = 10000;
		System.out.println(acc1.toString());
		acc1.setRate();
		acc1.increaseRate();
		
		BankAccount acc2 = new BankAccount("Checking Account");
	
		BankAccount acc3 = new BankAccount("Saving Account", 3800);
	
		System.out.println(acc1.routingNumber);
		System.out.println(acc2.routingNumber);
		System.out.println(acc3.routingNumber);
	
	
		//Inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 5000;
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
	}

}
