package constructor; //with parameters
    
public class UserDefineConstructor2 {
	int num;
	int num1;
	String name;
	public UserDefineConstructor2() {// without parameter constructor
		num=25;
		num1=250;	
	}
	public UserDefineConstructor2(int i, int j) {
		
		num=i;
		num1=j;
		int sum =num+num1;
		System.out.println("two para"+sum);
	}
	public void addition() {
		int sum=num+num1;
		System.out.println("without parameter addition is:"+sum);
	}
	
	public void addition1(int x , int y) {
		num=x;
		num1=y;
		int sum1= num+num1;
		System.out.println("with two parameteraddition is:"+sum1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDefineConstructor2 UDWP=new UserDefineConstructor2();
		UDWP.addition();
		UserDefineConstructor2 UDWP1=new UserDefineConstructor2(10,40);
		UDWP1.addition1(30, 40);
		
	}

}
