package inheritance;

public class carTestClass {

	public static void main(String[] args) {// single level inheritance
		
		kia E2=new kia();
		E2.automativ();
		E2.start();
		E2.stop();
		E2.refuel();
		System.out.println("  ");
		Son E3=new Son();
		E3.Mobile();
		E3.car();
		E3.cash();
		E3.home();
		

	}

}
