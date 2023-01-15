package constructor;

public class DefaultConstructor {
	String name;
	int rollno;
	
	public DefaultConstructor() {
		 System.out.println("DefaultConstructor");
	}
	public static void main(String[] args) {
		
		DefaultConstructor DC=new DefaultConstructor();
		DefaultConstructor DC1=new DefaultConstructor();
		DC1.m1();
	}
    public void m1() {
    System.out.println("default method");	
   
    }
}
