package TypesOfVariables;

public class nonstaticglobVriabledifferentclass {

	public static void main(String[] args) {
		// Non static global variable calling from different class
		NonstaticGlobalVariables nsod= new NonstaticGlobalVariables ();// can be called by only object
		System.out.println(nsod.i);
		System.out.println(nsod.k);
	}

}
