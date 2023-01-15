package AccessSpecifiers;

public class Private {
	
	private int p=32; // private member has scope within the same class only.

	public static void main(String[] args) {
		
		Private s1=new Private ();
		System.out.println(s1.p);
		s1.Demo();
		

	}
private void Demo() {  //private class is used as member
		
		System.out.println("AS : Private");
	}

}
