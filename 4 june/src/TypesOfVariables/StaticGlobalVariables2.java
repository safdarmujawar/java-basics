package TypesOfVariables;

public class StaticGlobalVariables2 {
       static String name= "gulbi";
       static int g=75;
	public static void main(String[] args) {
		 
		//passing string as global variable
		System.out.println(name);
		System.out.println(g);
		StaticGlobalVariables2 SG=new StaticGlobalVariables2();
		SG.m1();

	}
        public void m1() {
        	
        String	k="kulfi";
        int     l=25;
        System.out.println(k);
        System.out.println(l);
        }
     
}
