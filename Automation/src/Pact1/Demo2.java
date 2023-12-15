package Pact1;

class myclass{
	
	void m1() {
		System.out.println("Manual Testing");
	}
	
	void m2() {
		System.out.println("Automation Testing");
	}
	
}

class myclass2{
	void m3() {
		System.out.println("Selenium with java");
	}
}


public class Demo2 {

	public static void main(String[] args) {
        
		//Create Object Calling methods
		myclass obj=new myclass();
		myclass2 obj1=new myclass2();
		obj.m1();
		obj.m2();
		obj1.m3();
		
		
		
		
	}

}
