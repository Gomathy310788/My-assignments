package week3assignment;

public class AxisBank extends BankInfo {

	public void Deposit() {
		System.out.println("Axis Bank ");
		
	}
	public void saving() {
		System.out.println("Savings Account");

	}
	
	public void fixed() {
		System.out.println("Fixed Account");

	}
	
	public static void main(String[] args) {
		AxisBank obj=new AxisBank();
		obj.saving();
		obj.deposit();
		obj.fixed();
		obj.Deposit();
	}

}

