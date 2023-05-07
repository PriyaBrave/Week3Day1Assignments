package BankMethodOverriding;

public class AxisBank extends BankInfo {
	
	public void depositAmount(int depositamt) {
		System.out.println("Axis Bank Deposited Amount: "+depositamt);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank ab = new AxisBank();
		ab.depositAmount(500000);
		ab.savingsAmount(450000);
		ab.fixedAmount(1000000);
		
		//Method Overriding
		System.out.println("\n \nMethod Overriding..");
		BankInfo bi = new BankInfo();
		bi.depositAmount(200000);
	}
}
