package constructor;
public class DefaultConstructor1 {
/*
 * 
 * Default constructor
 * public DefaultConstructor1(){
 * super();
 * }
 * 
 * Use - it copies the members of class into object - After creation of object
 * 
 * 1. Rules - It always no argument/zero parameter constructor
 * 2. Access modifier of the default constructor is same as class modifier.
 * 3. Default constructor contains only one line that is super keyword.
 */
	
	
	public static void main(String[] args) {
	
		
		DefaultConstructor1 D1 = new DefaultConstructor1();
		D1.m1();
		D1.addition();
		

	}
	
	public void m1() {
		System.out.println("Zero parameter method");
	}
	
	public void addition() {  // Non static method
		
		int a=10;
		int b=20;
		int add = a+b;
		System.out.println(add);
		
	}

}