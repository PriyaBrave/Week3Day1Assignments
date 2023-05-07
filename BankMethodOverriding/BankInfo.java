package BankMethodOverriding;

public class BankInfo {
	public void savingsAmount(int savings) {
		System.out.println("Savings: "+savings);
	}
	
	public void fixedAmount(int fixed) {
		System.out.println("Fixed Deposit: "+fixed);
	}
	
	public void depositAmount(int depositamt) {
		System.out.println("Deposited Amount (BankInfo): "+depositamt);
	}
}
