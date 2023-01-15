package Abstraction;

public abstract class RbiBank {
	
	public void credit() {
		
		System.out.println("method for credit");
	}
    public void debit() {
		
		System.out.println("method for debit");
	}
    
    public abstract void loan();
    
    public abstract void fixDeposite();
}
