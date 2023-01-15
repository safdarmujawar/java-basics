package hierarchicalInheritance;

public class hierarchicalInheritanceTestClass {

	public static void main(String[] args) {
		
		son e1= new son();
		e1.mobile();
		e1.property();
		
		System.out.println(" ");
		
		son2 e2= new son2();
		e2.laptop();
		e2.property();
		
		System.out.println(" ");
		
		son3 e3= new son3();
		e3.bike();
		e3.property();

	}

}
