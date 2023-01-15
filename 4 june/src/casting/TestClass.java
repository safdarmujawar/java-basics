package casting;

public class TestClass {

	public static void main(String[] args) {
		
		SuperClass s=new ChildClass();//up casting
		s.bike();
		s.car();
		((ChildClass) s).petrol();
		((ChildClass) s).Diesel();
		
		ChildClass c=(ChildClass) new SuperClass();// down casting
		
		c.bike();
		c.car();
		c.petrol();
		c.Diesel();
		
	}

}
