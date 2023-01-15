package Methods;

public class Method1 { //class body
	
	//static regular method calling from same class

	public static void main(String[] args) { //main method body 
	       // starting point of programs
         System.out.println("main method started");
         
         //1.direct calling
         //syntax= method name ();
         
         System.out.println("//1.direct calling");
         m1();
         staticmethodm2();
         //2.calling by class name
         //syntax = classname.methodname();
         
         System.out.println("//2.calling by classname");
        Method1.m1();
        Method1.staticmethodm2();
         System.out.println("main method ended");
	}
          public static void m1() {
        	  System.out.println("static method running from same class m1()");
          }
          
          public static void staticmethodm2() {
        	 System.out.println("static method running from same class m2()"); 
        	 
          }
}
