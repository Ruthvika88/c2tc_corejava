package execute;

public class Execute1 extends Base {

	public static void main(String[] args) {
		
		Base b2=new Base();//cannot create object for class in other package
		
		//protected
		System.out.println(b2.variableProtected);// not able to access ouside package
		
		
		//private
		System.out.println(b2.variableprivate); //not able to access outside class and package
		
		//default
		System.out.println(b2.variableDefault);// not able access outside package
		
		
		//public 
		System.out.println(b2.variablepublic);// can access both ouside class and package

	}

}