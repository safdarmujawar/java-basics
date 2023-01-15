package Polymorphism;

public class Method_overloading { //method overloading (compiletime polymorphism)
	
	public static void main(String []args) {
		
		Method_overloading m=new Method_overloading();
		m.overload(10, 20);
		m.overload(2, 03, 05);
		m.overload("S");
		
	}
	
	public void overload(int a , int b) {
		
		int sum=a+b;
		System.out.println("sum is ="+sum);
		
	}
	
	public void overload(int a,int b ,int c) {
		
	      int sum=a+b-c;
	      System.out.println("sum is ="+ sum);
	}
	
	public void overload (String s) {
		String S= ("fulloverload");
		System.out.println(S);
		
	}

}
