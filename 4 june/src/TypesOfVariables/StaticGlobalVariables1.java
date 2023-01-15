package TypesOfVariables;

public class StaticGlobalVariables1 {
	
	static int i=40;

	public static void main(String[] args) {
		// Creating variables outside method/block is called as global variables
		
		//static global variables from same class
                System.out.println(i);
                StaticGlobalVariables1 SG= new StaticGlobalVariables1();
                SG.m1();
                SG.m2();           
	}
          public void m1(){
        	  // local variable
        	  i=30;
        	  System.out.println(i);  
          }
          public void m2() {
        	  
        	  i=50;   //  local variable
        	  System.out.println(i);
          }
}
