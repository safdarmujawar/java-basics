package String;

public class String4_CharAt_method {

	public static void main(String[] args) {
		
		String s1 = new String("Auto-generated method stub");
		String s2 = new String("Auto-generated method stub");
		
		String s3 = "new ";
		String s4 = "day ";
		String s5 = "rocks ";
		
		String s6 = "generated";
		
        System.out.println(s1.charAt(1));
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println(" ");
        System.out.println(s1.lastIndexOf("e"));
        System.out.println(s1.indexOf("e"));
        System.out.println(s1.equals(s2));
        
        System.out.println(s3.concat(s4.concat(s5)));
        System.out.println(s1.substring(4));
        System.out.println(s1.substring(15));
        
        System.out.println(s1.startsWith("A"));
        System.out.println(s1.endsWith("b"));
        
        System.out.println(s1.contains(s6));
        
        System.out.println(s1.replace("Auto", "manual"));
        
       
       
	}

}
