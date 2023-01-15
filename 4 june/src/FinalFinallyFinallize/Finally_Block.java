package FinalFinallyFinallize;

public class Finally_Block {

	public static void main(String[] args) {
		
		//Finally : Finally is block in java exception handling to execute the important 
		//	code weather execution occurs or not
		Finally_Block.test1();
	}
	
	public static void test1() {
		
		try {
			System.out.println(	);
		}
		catch(Exception e){
			System.out.println("exception");
			
		}
		finally {
			System.out.println("finally");
		}
	}

}
