package String;

public class Rev {

	public static void main(String[] args) {
		String input="1 2 3 4 5 6 7 8 9";
		String output="";
		
		for(int i=input.length()-1;i>=0;i--) 
			
			output=output+ input.charAt(i);
		System.out.println(output);

	}

}
