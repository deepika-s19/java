class StaticVariable{
	static int i = 10;
	int j = 20;
	void m1(){
		static int k = 10;
		System.out.println("the value of static variable i :" + i);
		System.out.println("the value of static variable accessed with this key word:" + this.i);
	}
	class TestStaticVariable{
	public static void main(String[] args){
	    StaticVariable sv = new StaticVariable();
		System.out.println("acessing static variiable with object refernce:"  + sv.i);
		System.out.println("acessing the static variable with the refernce variable:"  + StaticVariable.i);
		sv.m1();
		StaticVariable sv2 =  null;
		System.out.println("the static variable is :" + sv2.i);
		
	   }
    }
}