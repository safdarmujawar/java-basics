package String;

public class String1_memory_allocation {

	public static void main(String[] args) {
		// memory allocation
		
		String s1=new String ("java");
		String s2= "java";
		String s3=s1;
		
		System.out.println(s1==s2);//false as memory location is different
		System.out.println(s2==s3);
		System.out.println(s1==s3);
		
		System.out.println(s2.toUpperCase());
	}

}
