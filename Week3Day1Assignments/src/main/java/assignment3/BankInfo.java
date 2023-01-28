package assignment3;

/*Assignment3
============
    Class     :BankInfo
    Methods :saving(),fixed(),deposit()

     Class     :AxisBank
     Methods :deposit()

Description:
You have to override the method deposit in AxisBank.
*/

public class BankInfo {
	public void saving() {
		System.out.println("You have selected Savings Account");
	}
	public void fixed() {
		System.out.println("You have selected fixed deposit Account");
	}
	public void deposit(int amount) {
		System.out.println("You have deposited the amount of "+amount+"Rs");
	}


}
