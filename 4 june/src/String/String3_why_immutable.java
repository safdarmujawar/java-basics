package String;

public class String3_why_immutable {

	public static void main(String[] args) {
		// Why is immutable and final
		
		
				String s1 = "java"; // 
				String s2 = "java";
				
				String s3 = "Selenium";
				
				s2 = "python";
				s1= "c++";
				
				System.out.println(s2);
				
				System.out.println(s1);
				
		  /*1. Once we create an object after that java does not allow to perform changes.
				but if u r trying to perform any changes with those changes new object will be
				created*/  
				
		 //2. Security
				
		 //3. Code optimization and performance

	}

}
