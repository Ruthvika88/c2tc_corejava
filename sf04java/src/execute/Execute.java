package execute;

public class Execute {

	public static void main(String[] args) {
		
		Base b1=new Base();
		
		//protected 
		System.out.println(b1.variableProtected);// able to access within package
		
		//private
		System.out.println(b1.variableprivate); //not able to access outside class 
		
		//default
		System.out.println(b1.variableDefault);// can access ouside class
		
		//public 
		System.out.println(b1.variablepublic);//can access both ouside class and package
		
		

	}

}