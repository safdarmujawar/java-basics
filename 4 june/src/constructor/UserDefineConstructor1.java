package constructor;

public class UserDefineConstructor1 {
	// without parameter
	int i;//declaration
	int j;
	
	public UserDefineConstructor1(){
		
		i=60; // Initialization
	    j=30;
		
	}
	 
	 
	 public void Multiplication(){
		 
         int mul=i*j;
		 System.out.println("multiplication is:"+mul);
	 }
	 
	 public void Division(){
		 
         int div=i/j;
		 System.out.println("division is:"+div);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserDefineConstructor1 UDC=new UserDefineConstructor1();
		UDC.Multiplication();
		UDC.Division();
		
	}

}
