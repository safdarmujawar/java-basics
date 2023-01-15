package Polymorphism;

public class Test_class_father_son {

	public static void main(String[] args) {
		
		
	son s=new son();
	s.car();
	s.cash();
	s.property();
	s.mobile();
	
	System.out.println(" ");
	
	father f=new father();
	f.car();
	f.cash();
	f.property();
	
	son s1=(son) new father();// down casting
	

	}

}
