package Abstraction;

public class TestClassForAbstractClass {

	public static void main(String[] args) {
    
		//create object for concrete class
		
		 Concrete_Class c1=new  Concrete_Class();
		 c1.m1();
		 c1.m2();
		 c1.m3();
		 
		System.out.println("  "); 
		
		 completeClass cc=new completeClass();
		 cc.m1();
		 cc.m2();
		 cc.m3();

	}

}
