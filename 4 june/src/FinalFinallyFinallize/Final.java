package FinalFinallyFinallize;

public class Final {

	public static void main(String[] args) {
		
		
		// Final - Final is the keyword and access modifier which is used to restriction on
		//	variables,classes and methods
			
	// Final Class can not be inherited to child class
	// Final Method means can not be overridden by subclass
	// Once we declared as final variable we can not  be modified
			int i = 100;
			
			System.out.println(i);
			
			i = 200;
			System.out.println(i);
			
			
			final int j =300;
			System.out.println(j);
			//j=400;
		}
		public final void finalmethod() {
			System.out.println("Final Method");
		}

	
}
