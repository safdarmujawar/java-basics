package Methods;

public class Method10 {

	public static void main(String[] args) {
		// method with parameters
		addition(100,200);
		substraction(40,20);
		addition1(50,60,20);
	}
       
	  public static void addition (int x ,int y){
		  
		 int z=x+y;
		  System.out.println("addition of two numbers"+z);
	  }
	  public static void substraction (int a ,int b) {
		  
		  int c=a-b;
		  System.out.println("substraction of two numbers"+c);  
	  }
	  
	  public static void addition1 (int p ,int q , int r) {
		  int sum= p+q-r;
		  System.out.println(sum);
	  }
}
