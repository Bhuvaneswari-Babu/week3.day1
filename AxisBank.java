package week3.day1;

public class AxisBank extends BankInfo{
	public void deposit(String Axisdep) {
		System.out.println("Axis Bank deposit account");
	}
	public static void main(String[] args) {
	     AxisBank account=new AxisBank();
	     account.deposit(null);
	}

}
