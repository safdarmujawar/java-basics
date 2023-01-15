package Abstraction;

public class sbibank extends RbiBank {

	public static void main(String[] args) {
     
		sbibank s1=new sbibank();
		s1.credit();
		s1.debit();
		s1.loan();
		s1.fixDeposite();

	}

	@Override
	public void loan() {
		System.out.println("6.6% interest for loan");
		
	}

	@Override
	public void fixDeposite() {
		System.out.println("5.6% interest annual for FD");
		
		
	}

}
