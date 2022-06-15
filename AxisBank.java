package bank;
//override method
public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("Amount Deposited");
			}

	public static void main(String[] args) {
		
    BankInfo ban =new BankInfo();
      
      ban.saving();
      ban.fixed();
      ban.deposit();

	}

}
