package String;

public class String_reverse {

	public static void main(String[] args) {
		
		String S= "Automation";
		 int L= S.length();
		 
		 String Reverse= "";
		 
		// System.out.println(L);
		for(int i=L-1;i>=0;i--) { 
			Reverse= Reverse+S.charAt(i);
			
			
			
		}
		System.out.println(Reverse);

	}

}
