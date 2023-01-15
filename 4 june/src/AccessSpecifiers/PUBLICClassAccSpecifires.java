package AccessSpecifiers;

public class PUBLICClassAccSpecifires {
	
	public int a=342;// scope of this public member is throughout the all packages and throughout the whole project

	public static void main(String[] args) {
		
		PUBLICClassAccSpecifires s1=new PUBLICClassAccSpecifires();
		 System.out.println(s1.a);
		 s1.Demo();
 
	}
	
public void Demo() {  //public class is used as member
		
		System.out.println("AS : public");
	}

}
