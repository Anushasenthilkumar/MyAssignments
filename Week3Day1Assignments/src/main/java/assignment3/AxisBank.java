package assignment3;

public class AxisBank extends BankInfo{
	
	public void deposit(int amount) {
		System.out.println("You have deposited the amount of "+amount+"Rs in Axis Bank");
	}

	public static void main(String[] args) {
		AxisBank user1=new AxisBank();
		user1.deposit(50000);

	}

}
