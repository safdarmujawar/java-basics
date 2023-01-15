package mainmethod;

public class OverloadMainMethod {

	public static void main(String[] args) {
//		public static void main(String[] args) {
//		
	System.out.println("Main String[] args");
	}
	
      public static void main(int [] args) {
		
		System.out.println("Main int[] args");

	}

      
  //1. overloading of the main method is possible but JVM will always call
   //  String []args argument method only
      
  /*2. Inheritance Concept is applicable for main method hence while executing child class
      if the child class doesn't contain main method then parent class main method
      will be executed. */


	

}
