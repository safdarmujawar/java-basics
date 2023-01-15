package String;

public class String_split {

	public static void main(String[] args) {
		 String s= " to complete Local Variable Declaration Statement";
         String[]str= s.split(" ");
         System.out.println(str.length);
         
         for(int i=0;i<str.length;i++) {
       	  System.out.println(str[i]);
         }

	}

}
