package String;

public class String_equaland_dotequal_method {

	public static void main(String[] args) {
		
		String s1 =new String ("Mujawar");
		String s2 =new String ("Mujawar");
		String s3 = "mujawar";
		String s4 = "mujawar";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
	}
	

}
