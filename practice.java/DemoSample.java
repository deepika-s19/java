interface DemoSample{
	void m1();
	void m2();
	void m3();
}
interface DemoImplement extends DemoSample{
	void m1();
		system.out.println("implentatation of method 1");
	
	void m2();
		system.out.println("implentatation of method 2");
	
	void m3();
		system.out.println("implentatation of method 3");
	
}
class test{
	public static void main (String[] args){
		DemoSample obj = new DemoImplement();
		obj.m1();
		obj.m2();
		obj.m3();
		
		
	}
}