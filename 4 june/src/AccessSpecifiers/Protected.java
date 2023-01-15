package AccessSpecifiers;

public class Protected {
	
	protected int i=342;

	public static void main(String[] args) {

		Protected p1=new Protected();
		System.out.println(p1.i);
		p1.demo();
		

	}
	
	protected void demo() {
		
		System.out.println("As: protected");
	}

}
