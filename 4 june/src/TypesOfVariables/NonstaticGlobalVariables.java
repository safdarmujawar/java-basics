package TypesOfVariables;

public class NonstaticGlobalVariables {
      int i= 80;     //non static variable i
      String k=("velocity");  // non static variable string k
	public static void main(String[] args) {
		//Calling Non static global variables from same class
		
		NonstaticGlobalVariables NSG = new NonstaticGlobalVariables (); // for calling create object
		System.out.println(NSG.i);
		System.out.println(NSG.k);
		
		
		m1(); // calling by class name
		

	}
     public static void m1() {
    	 NonstaticGlobalVariables NSGO=new NonstaticGlobalVariables();// for calling create object
    	  int j=78;
    	  String q="outside";
    	  System.out.println(j);
    	  System.out.println(q);
     }
}
