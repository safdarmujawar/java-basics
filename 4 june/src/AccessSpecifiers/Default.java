package AccessSpecifiers;

public class Default {
	
	int d=15; // direct declared member considered as default by 

	public static void main(String[] args) {
		
		Default d1=new Default();
		System.out.println(d1.d); 
		
		d1.sample();
		

	}
     void sample() {
    	 System.out.println("As :default class");
     }
}
