package MultiLeveLInheritance;

public class MultilevelInheritanceTestClass {

	public static void main(String[] args) {
		
		whtsappVersion4 e1=new whtsappVersion4 ();
		e1.textmessage();
		e1.audiocall();
		e1.videocall();
		e1.ststus();
		
		System.out.println(" ");
		
		whtsappVersion3 e2=new whtsappVersion3 ();
		e2.textmessage();
		e2.audiocall();
		e2.videocall();
		
		System.out.println(" ");
		
		whtsappVersion2 e3=new whtsappVersion2();
		e3.textmessage();
		e3.audiocall();
		

	}

}

